package com.maven.patterns.StrategyPattern.demo;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.StrategyPattern.demo1
 * @Classname Method2
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/11 10:29
 * @Version 1.0
 */
public class Method2 implements DealMethod {
    @Override
    public void dealmethod() {
        System.out.println("This is Method2 !");
    }

    @Override
    public String getMethodName() {
        return "2";
    }
}
