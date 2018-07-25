package com.dyang;

import com.dyang.model.User;
import com.dyang.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XshopApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        User user = userService.getUserByName("yangjie");
        System.out.println(user);
    }

    @Test
    public void test(){
        User user = new User();
        user.setUsername("kkA");
        user.setId("9874651237845612");
        userService.saveUser(user);
        System.out.println(user);
    }

}
