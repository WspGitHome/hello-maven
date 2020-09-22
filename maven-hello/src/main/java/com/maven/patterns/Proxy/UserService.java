package com.maven.patterns.Proxy;


import com.maven.patterns.entity.User;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn
 * @Classname UserService
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/30 13:42
 * @Version 1.0
 */
public class UserService implements IUserService {
    @Override
    public boolean login(User user) {
        System.out.println("登录成功！");
        return true;
    }

    @Override
    public boolean register(User user) {
        System.out.println("注册成功！");
        return true;
    }
}
