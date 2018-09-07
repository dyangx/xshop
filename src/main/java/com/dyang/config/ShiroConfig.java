package com.dyang.config;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * shiro 配置类
 * Created by DYang on 2018/7/5
 */
@Configuration
public class ShiroConfig {
    @Bean
    public ShiroFilterFactoryBean xshopShiroFilter(SecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        //指定跳转
        shiroFilterFactoryBean.setLoginUrl("/account/login.html");
        shiroFilterFactoryBean.setSuccessUrl("/index.html");
        shiroFilterFactoryBean.setUnauthorizedUrl("/403");
        //自定义过滤器
        Map<String,Filter> filterMap = new LinkedHashMap<>();
        shiroFilterFactoryBean.setFilters(filterMap);
        //拦截器
        Map<String,String> filterChainDefinitionMap = new HashMap<>();
        filterChainDefinitionMap.put("/account/**","anon");
        filterChainDefinitionMap.put("/static/**","anon");
        filterChainDefinitionMap.put("/index/**","anon");
        filterChainDefinitionMap.put("/index*","anon");
        filterChainDefinitionMap.put("/login/**","anon");
        filterChainDefinitionMap.put("/logout","logout");
        filterChainDefinitionMap.put("/**","authc");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }

    /**
     * 安全管理器核心
     * @return
     */
    @Bean(name = "securityManager")
    public DefaultWebSecurityManager MySecurityManager(){
        DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
        manager.setRealm(shiroRealm());
        manager.setRememberMeManager(this.rememberMeManager());
        return manager;
    }

    @Bean
    public AuthRealm shiroRealm(){
        AuthRealm authRealm = new AuthRealm();
        return authRealm;
    }

    /**
     * cookie对象
     * rememberMeCookie方法是设置Cookie的生成模版，比如cookie的name，cookie的有效时间等等。
     * @return
     */
    @Bean
    public SimpleCookie rememberMeCookie(){
        //cookie名称
        SimpleCookie simpleCookie = new SimpleCookie("rememberMe");
        //30天
        simpleCookie.setMaxAge(259200);
        simpleCookie.setHttpOnly(true);
        return simpleCookie;
    }

    /**
     * cookie管理对象;
     * rememberMeManager方法是生成rememberMe管理器，而且要将这个rememberMe管理器设置到securityManager中
     * @return
     */
    @Bean
    public CookieRememberMeManager rememberMeManager(){
        CookieRememberMeManager cookieRememberMeManager = new CookieRememberMeManager();
        //cookie加密的密钥
        cookieRememberMeManager.setCipherKey(org.apache.shiro.codec.Base64.decode("yeAAo1E8BOeAYfBlm4NG9Q=="));
        cookieRememberMeManager.setCookie(rememberMeCookie());
        return cookieRememberMeManager;
    }
}