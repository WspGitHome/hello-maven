package com.maven.patterns.Observers;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.Observers
 * @Classname ObserverTwo
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/03 10:49
 * @Version 1.0
 */
public class ObserverTwo implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Here is Two! we got message:{" + message + "}");

    }
}
