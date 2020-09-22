package com.maven.patterns.Proxy;



import com.maven.patterns.entity.User;

import java.lang.reflect.Proxy;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn
 * @Classname UserLogsCollector
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/30 13:44
 * @Version 1.0
 */
public class UserLogsCollectorProxy {

    public boolean success;


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object createProx(Object proxiedObject) {
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        DynamicInvocationHandler handler = new DynamicInvocationHandler(proxiedObject);
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces, handler);
    }


    public static void main(String[] args) {
        UserLogsCollectorProxy proxy = new UserLogsCollectorProxy();
        IUserService userService = (IUserService)proxy.createProx(new UserService());
        userService.login(new User.Builder().setName("夏明").build());

    }
}

