package com.maven.patterns.Observers;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.Observers
 * @Classname Process
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/03 10:50
 * @Version 1.0
 */
public class Process {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.attachObserver(new ObserverOne());
        subject.attachObserver(new ObserverTwo());
        subject.notifiyObservers("id:777");
    }
}
