package com.stooges.pattern.Factory;

/**
 * @author 张超
 * @date 2017/2/17.
 */
public class DomainLogin implements Login {
    @Override
    public boolean verify(String name, String password) {
        return false;
    }
}
