package com.maven.patterns.GuavaEventBus;

import com.maven.patterns.Observers.EventBus.Subscribe;
import com.maven.patterns.entity.Base;
import com.maven.patterns.entity.User;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn
 * @Classname fw
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/29 10:01
 * @Version 1.0
 */
public class DataDealListener {
    public DataDealListener() {
    }

    @Subscribe
    public void insertData(List<User> users) {
        System.out.println(users.stream().map(x -> x.toString()).collect(Collectors.joining(" | ")));
    }


    @Subscribe
    public void insertData2(List<Base> users) {
        System.out.println("--------------------");
    }

}
