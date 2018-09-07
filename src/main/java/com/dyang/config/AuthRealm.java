package com.dyang.config;

import com.dyang.model.User;
import com.dyang.service.UserService;
import com.dyang.util.ConfigUtil;
import com.dyang.util.MD5Util;
import com.dyang.util.ShiroUtil;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by DYang on 2018/7/5
 */
public class AuthRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;
    /**
     * 授权验证函数
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        return null;
    }

    /**
     * 登陆验证函数
     * @param
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authToken) throws AuthenticationException {
        Session session = ShiroUtil.getSession();
        UsernamePasswordToken token = (UsernamePasswordToken) authToken;
        User user = userService.getUserByName(token.getUsername());
        if(user == null){
            throw new UnknownAccountException("用户名或密码错误！");
        }else if(user.getPassword().equals(MD5Util.MD5(token.getPassword()+ ConfigUtil.SALT))){
            session.setAttribute(ConfigUtil.USER_SESSION, user);
            return new SimpleAuthenticationInfo(token.getUsername(),token.getPassword(),this.getName());
        }
        throw new IncorrectCredentialsException("用户名或密码错误！");
    }
}
