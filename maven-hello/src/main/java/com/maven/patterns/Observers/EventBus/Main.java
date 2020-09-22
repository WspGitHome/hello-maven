package com.maven.patterns.Observers.EventBus;


import com.maven.patterns.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.Observers.EventBus
 * @Classname Main
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/04 10:14
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        EventBus eventBus = new EventBus(executorService);
        eventBus.register(TestEventBus.class);
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            userList.add(new User.Builder().setAge(i).setName("姓名" + i).build());
            if (userList.size() >= 20) {
                userList.clear();
                eventBus.post(userList);
            }
        }
        executorService.shutdown();
    }
}
