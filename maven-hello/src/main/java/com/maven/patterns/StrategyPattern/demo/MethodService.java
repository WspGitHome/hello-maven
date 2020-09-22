package com.maven.patterns.StrategyPattern.demo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.StrategyPattern.demo1
 * @Classname MethodService
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/11 10:44
 * @Version 1.0
 */
public class MethodService {
    private static final List<Type1> OMethods = new ArrayList<>();
    private static final List<Type2> TMethods = new ArrayList<>();

    static {
        OMethods.add(new Type1(1, 10, MethodStrategyFactory.getStrategyMethod("1")));
        OMethods.add(new Type1(10, 20, MethodStrategyFactory.getStrategyMethod("2")));
        OMethods.add(new Type1(20, 30, MethodStrategyFactory.getStrategyMethod("3")));
        OMethods.add(new Type1(30, 40, MethodStrategyFactory.getStrategyMethod("4")));

        TMethods.add(new Type2("1", MethodStrategyFactory.getStrategyMethod("1")));
        TMethods.add(new Type2("2", MethodStrategyFactory.getStrategyMethod("2")));
        TMethods.add(new Type2("3", MethodStrategyFactory.getStrategyMethod("3")));
        TMethods.add(new Type2("4", MethodStrategyFactory.getStrategyMethod("4")));
    }

    public static void startDeal1(Serializable param) {
        DealMethod dealMethod = null;
        for (Type1 deal : OMethods) {
            if (deal.inRange(param)) {
                dealMethod = deal.getDealMethod();
                dealMethod.dealmethod();
                break;
            }
        }
    }

    public static void startDeal2(Serializable param) {
        DealMethod dealMethod = null;
        for (Type2 deal : TMethods) {
            if (deal.isStrategy(param)) {
                dealMethod = deal.getDealMethod();
                break;
            }
        }
        dealMethod.dealmethod();
    }

    public static void main(String[] args) {
        startDeal1(22);
//        startDeal2("3");
    }
}
