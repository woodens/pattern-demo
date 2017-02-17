package com.stooges.pattern.Factory;

/**
 * @author 张超
 * @date 2017/2/17.
 */
public class LoginManager {
    public static Login factory(String type){
        if(type.equals("password")){
            return new PasswordLogin();
        }else if(type.equals("passcode")){
            return new DomainLogin();
        }else{
            throw new RuntimeException("没有找到登录类型");
        }
    }
}
