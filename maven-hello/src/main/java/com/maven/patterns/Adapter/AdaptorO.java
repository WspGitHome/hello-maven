package com.maven.patterns.Adapter;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.Adapter
 * @Classname AdaptorO
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/31 14:03
 * @Version 1.0
 */
public class AdaptorO implements ITarget {

    private Adaptee adaptee;

    public AdaptorO(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        adaptee.fa();
    }

    @Override
    public void f2() {
        adaptee.fb();
    }

    @Override
    public void f3() {
        adaptee.fc();
    }
}
