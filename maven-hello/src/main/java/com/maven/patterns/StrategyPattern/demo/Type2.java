package com.maven.patterns.StrategyPattern.demo;

import java.io.Serializable;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.StrategyPattern.demo1
 * @Classname Type2
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/11 10:56
 * @Version 1.0
 */
public class Type2 {
    private String strategy;
    private DealMethod dealMethod;

    public DealMethod getDealMethod() {
        return dealMethod;
    }

    public Type2(String strategy, DealMethod dealMethod) {
        this.strategy = strategy;
        this.dealMethod = dealMethod;
    }

    public boolean isStrategy(Serializable param) {
        return strategy.equals(param);
    }
}
