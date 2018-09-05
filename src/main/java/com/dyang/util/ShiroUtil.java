package com.dyang.util;

import com.dyang.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

/**
 * shiro 工具类
 * Created by DYang on 2018/7/5
 */
public class ShiroUtil {

    /**
     * 获取用户基本信息
     * @return
     */
    public static User getUserInfo(){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        return (User)session.getAttribute(ConfigUtil.USER_SESSION);
    }

    /**
     *
     * @return
     */
    public static Session getSession(){
        return SecurityUtils.getSubject().getSession();
    }
}
