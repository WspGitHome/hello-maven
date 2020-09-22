package com.maven.patterns.Observers.EventBus;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.Observers.EventBus
 * @Classname ObserverAction
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/03 15:03
 * @Version 1.0
 */
public class ObserverAction {
    private Object target;
    private Method method;

    public ObserverAction(Object target, Method method) {
        this.target = target;
        this.method = method;
        this.method.setAccessible(true);
    }

    public void execute(Object event) {
        try {
            method.invoke(target, event);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
