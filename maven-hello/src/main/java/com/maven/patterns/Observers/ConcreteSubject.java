package com.maven.patterns.Observers;

import java.util.ArrayList;
import java.util.List;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.Observers
 * @Classname ConcreteSubject
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/03 10:46
 * @Version 1.0
 */
public class ConcreteSubject implements Subject {
    List<Observer> observers = new ArrayList<>();

    @Override
    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void dettachObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifiyObservers(String message) {
        observers.forEach(x -> {
            x.update(message);
        });
    }
}
