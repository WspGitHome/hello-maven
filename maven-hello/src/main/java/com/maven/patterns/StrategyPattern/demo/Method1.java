package com.maven.patterns.StrategyPattern.demo;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.StrategyPattern.demo1
 * @Classname Method1
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/11 10:28
 * @Version 1.0
 */
public class Method1 implements DealMethod {
    @Override
    public void dealmethod() {
        System.out.println("This is Method1 !");
    }

    @Override
    public String getMethodName() {
        return "1";
    }
}
