package com.maven.patterns.Observers.EventBus;

import java.util.List;
import java.util.concurrent.Executor;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.Observers.EventBus
 * @Classname EventBus
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/03 17:22
 * @Version 1.0
 */
public class EventBus {
    private Executor executor;
    private ObserverRegistry registry = new ObserverRegistry();

    public EventBus(Executor executor) {
        this.executor = executor;
    }

    public void register(Object object) {
        registry.register(object);
    }

    public void post(Object event) {
        List<ObserverAction> observerActions = registry.getMatchedObserverActions(event);
        for (ObserverAction observerAction : observerActions) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    observerAction.execute(event);
                }
            });
        }
    }

}

