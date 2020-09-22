package com.maven.patterns.Observers;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.Observers
 * @Classname ObserverOne
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/03 10:49
 * @Version 1.0
 */
public class ObserverOne implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Here is one! we got message:{" + message + "}");
    }
}
