package com.dyang.service.impl;

import com.dyang.model.MenuVO;
import com.dyang.model.ProductVO;
import com.dyang.respository.IndexRepository;
import com.dyang.respository.ProductRepository;
import com.dyang.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<MenuVO> getMenu() {
        List<MenuVO> menuList = indexRespository.getMenu();
        for(MenuVO vo : menuList){
            List<ProductVO> list = productRepository.getPorducts(vo.getNumber());
            vo.setList(list);
        }
        return menuList;
    }
}
