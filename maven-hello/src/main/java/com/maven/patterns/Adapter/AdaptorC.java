package com.maven.patterns.Adapter;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.Adapter
 * @Classname Adaptor
 * @Description 类适配器：基于继承
 * @Authors Mr.Wu
 * @Date 2020/07/31 14:01
 * @Version 1.0
 */
public class AdaptorC extends Adaptee implements ITarget {
    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        super.fb();
    }

    @Override
    public void f3() {
        super.fc();
    }
}
