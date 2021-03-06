package com.dyang;

import org.apache.shiro.codec.Base64;
import org.junit.Test;
import org.springframework.lang.Nullable;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.validation.constraints.NotNull;
import java.security.NoSuchAlgorithmException;

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

    @Test
    public void genarateKey() throws NoSuchAlgorithmException {
        KeyGenerator keygen = KeyGenerator.getInstance("AES");
        SecretKey deskey = keygen.generateKey();
        System.out.println(Base64.encodeToString(deskey.getEncoded()));
    }

    @Test
    public void test(){
        System.out.println(org.apache.shiro.codec.Base64.decode("874512=="));
    }

    @Test
    public void test3() throws InterruptedException {
        Long t1 = System.currentTimeMillis();
        Thread.sleep(1000L);
        System.out.println(System.currentTimeMillis()-t1);
        test4(null);
    }
    public void test4(@com.sun.istack.internal.NotNull String x) {
        System.out.println(x);
    }
}
