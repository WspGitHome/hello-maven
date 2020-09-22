package com.maven.patterns.TemplatePattern;


/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.TemplatePattern
 * @Classname AbstractClass
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/04 13:54
 * @Version 1.0
 */
public abstract class AbstractClass {
    public final void templateMethod() {
        method1();
        method2();
    }

    protected abstract void method1();

    protected void method2() {
        System.out.println("AbstractClass : method2 ");
    }
}
