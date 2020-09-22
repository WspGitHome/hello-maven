package com.maven.patterns.Observers.EventBus;


import com.maven.patterns.entity.Base;
import com.maven.patterns.entity.User;

import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.Observers.EventBus
 * @Classname TestEventBus
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/03 17:33
 * @Version 1.0
 */
public class TestEventBus {
    @Subscribe
    public void f1(List<User> users){
        System.out.println(users.stream().map(x->x.getName()).collect(Collectors.joining("|")));
        System.out.println(users.size()+"---1---");

    }
    @Subscribe
    public void f2(List<User> users){
        System.out.println(users.stream().map(x->x.getAge().toString()).collect(Collectors.joining("|")));
        System.out.println(users.size()+"---2---");
    }
    @Subscribe
    private void f3(List<Base> users){
        System.out.println("------BASE------");
    }

    public static void main(String[] args) {


    }
}
