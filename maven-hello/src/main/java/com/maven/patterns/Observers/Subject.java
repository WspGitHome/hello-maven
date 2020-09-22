package com.maven.patterns.Observers;

import sun.plugin2.message.Message;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.Observers
 * @Classname Subject
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/03 10:44
 * @Version 1.0
 */
public interface Subject {
    void attachObserver(Observer observer);

    void dettachObserver(Observer observer);

    void notifiyObservers(String message);

}
