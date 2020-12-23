package com.maven.patterns.StrategyPattern.demo;

import com.maven.patterns.StrategyPattern.demo.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.StrategyPattern.demo1
 * @Classname MethodStrategyFactory
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/11 10:31
 * @Version 1.0
 */
public class MethodStrategyFactory {
    private static final Map<String, DealMethod> methodMap = new HashMap<>();

    static {
        methodMap.put("1", new Method1());
        methodMap.put("2", new Method2());
        methodMap.put("3", new Method3());
        methodMap.put("4", new Method4());
    }

    public static DealMethod getStrategyMethod(String type) {
        return methodMap.get(type);
    }
}
