package com.maven.patterns.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn
 * @Classname DynamicInvocationHandler
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/30 14:07
 * @Version 1.0
 */
public class DynamicInvocationHandler implements InvocationHandler {

    private Object proxiedObject;

    public DynamicInvocationHandler(Object proxiedObject) {
        this.proxiedObject = proxiedObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before Method!");
        Object invoke = method.invoke(proxiedObject, args);
        System.out.println("After Method!");
        String record = proxiedObject.getClass().getName() + ":" + method.getName() + "记录请求体：" + args[0].toString() + "时间戳：" + System.currentTimeMillis();
        System.out.println("records->" + record);
        return invoke;
    }
}
