package com.dyang;

import com.dyang.model.MenuVO;
import com.dyang.model.User;
import com.dyang.service.IndexService;
import com.dyang.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XshopApplicationTests {

    @Autowired
    UserService userService;

    @Autowired
    IndexService indexService;

    @Test
    public void contextLoads() {
        User user = userService.getUserByName("yangjie");
        System.out.println(user);
    }

    @Test
    public void test() throws InterruptedException {
        Long t1 = System.currentTimeMillis();
        Thread.sleep(1000L);
        System.out.println(System.currentTimeMillis()-t1);
    }

    @Test
    public void test2() throws InterruptedException, ExecutionException, TimeoutException {
        Long t1 = System.currentTimeMillis();
        List<MenuVO> list = indexService.getMenuThread();
        System.err.println("耗时："+(System.currentTimeMillis()-t1));
        System.out.println(list);
    }
    @Test
    public void test3() throws InterruptedException {
        Long t1 = System.currentTimeMillis();
        List<MenuVO> list = indexService.getMenu();
        System.err.println("耗时："+(System.currentTimeMillis()-t1));
        System.out.println(list);
    }

    public void test4(@NotNull String x){

    }
}
