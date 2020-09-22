package com.maven.patterns.Adapter;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.Adapter
 * @Classname Adaptee
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/31 13:59
 * @Version 1.0
 */
public class Adaptee {
    public void fa() {
        System.out.println("不兼容的接口方法fa");
    }

    public void fb() {
        System.out.println("不兼容的接口方法fb");

    }

    public void fc() {
        System.out.println("不兼容的接口方法fc");

    }
}
