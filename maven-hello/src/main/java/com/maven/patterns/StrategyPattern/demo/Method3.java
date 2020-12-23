package com.maven.patterns.StrategyPattern.demo;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.StrategyPattern.demo1
 * @Classname Method3
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/11 10:30
 * @Version 1.0
 */
public class Method3 implements DealMethod {
    @Override
    public void dealmethod() {
        System.out.println("This is Method3");
    }

    @Override
    public String getMethodName() {
        return "3";
    }
}
