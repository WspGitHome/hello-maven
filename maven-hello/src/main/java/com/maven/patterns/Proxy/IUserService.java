package com.maven.patterns.Proxy;


import com.maven.patterns.entity.User;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn
 * @Classname IUserService
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/30 13:39
 * @Version 1.0
 */
public interface IUserService {

    boolean login(User user);

    boolean register(User user);
}
