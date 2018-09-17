package com.dyang.service.impl;

import com.dyang.model.MenuVO;
import com.dyang.model.ProductVO;
import com.dyang.respository.IndexRepository;
import com.dyang.respository.ProductRepository;
import com.dyang.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by DYang on 2018/9/12
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    IndexRepository indexRespository;

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<MenuVO> getMenuThread() throws InterruptedException, ExecutionException, TimeoutException {
        //线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<MenuVO> menuList = indexRespository.getMenu();
        List<FutureTask> listTask = new ArrayList<>();
        for(MenuVO vo : menuList){
            Callable<List<ProductVO>> callable = new Callable() {
                @Override
                public List<ProductVO> call() throws Exception {
                    Thread.sleep(1000L);
                    return productRepository.getPorducts(vo.getNumber());
                }
            };
            FutureTask futureTask = new FutureTask<>(callable);
            listTask.add(futureTask);
            executorService.execute(futureTask);
        }
        //取出task
        for(int i=0;i<menuList.size();i++){
            FutureTask task = listTask.get(i);
            menuList.get(i).setList((List<ProductVO>) task.get(2000L,TimeUnit.MILLISECONDS));
        }
        return menuList;
    }

    @Override
    public List<MenuVO> getMenu() throws InterruptedException {
        List<MenuVO> menuList = indexRespository.getMenu();
        for (MenuVO vo : menuList){
            vo.setList(productRepository.getPorducts(vo.getNumber()));
            Thread.sleep(1000L);
        }
        return menuList;
    }

    @Override
    public List<ProductVO> getStarProduct() {
        return productRepository.getStarPro();
    }
}
