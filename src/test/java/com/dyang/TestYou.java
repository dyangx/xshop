package com.dyang;

import org.junit.Test;

/**
 * Created by DYang on 2018/7/25
 */
public class TestYou {

    @Test
    public void test2(){
        String x  = "123456";

        try {
            char a =  x.charAt(8);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
