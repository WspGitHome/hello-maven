package com.maven.patterns.TemplatePattern;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.TemplatePattern
 * @Classname ConcreteClass1
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/04 13:55
 * @Version 1.0
 */
public class ConcreteClass1 extends AbstractClass {
    @Override
    protected void method1() {
        System.out.println("ConcreteClass1 : method1 ");
    }

    @Override
    protected void method2() {
        System.out.println("ConcreteClass1 : method2 ");

    }

    public static void main(String[] args) {
        AbstractClass demo = new  ConcreteClass1();
        demo.templateMethod();
    }
}
