package com.maven.patterns.StrategyPattern.demo;

import java.io.Serializable;
import java.util.function.Function;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.StrategyPattern.demo1
 * @Classname Type1
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/11 10:36
 * @Version 1.0
 */
public class Type1 {
    private Integer start;
    private Integer end;
    private DealMethod dealMethod;


    public Type1(Integer start, Integer end, DealMethod dealMethod) {
        this.start = start;
        this.end = end;
        this.dealMethod = dealMethod;
    }

    public boolean inRange(Serializable num) {
        return (int) num >= start && (int) num < end;
    }

    public DealMethod getDealMethod() {
        return dealMethod;
    }
}
