package com.maven.patterns.Observers.GoogleEventBus;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Packagename com.maven.patterns.Observers.GoogleEventBus
 * @Classname EventBusCenter
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/11/10 15:23
 * @Version 1.0
 */
public class EventBusCenter {

//    private static EventBus eventBus = new AsyncEventBus(Executors.newFixedThreadPool(2));
    private static EventBus eventBus = new EventBus();

    private EventBusCenter() {
    }

    public static EventBus getInstance() {
        return eventBus;
    }
    //添加观察者
    public static void register(Object obj) {
        eventBus.register(obj);
    }
    //移除观察者
    public static void unregister(Object obj) {
        eventBus.unregister(obj);
    }
    //把消息推给观察者
    public static void post(Object obj) {
        eventBus.post(obj);
    }
}

