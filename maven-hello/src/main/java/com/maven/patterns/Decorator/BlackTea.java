package com.maven.patterns.Decorator;

/**
 * @Packagename com.maven.patterns.Decorator
 * @Classname BlackTea
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/01/12 14:28
 * @Version 1.0
 */
public class BlackTea extends Beverage {
    @Override
    String getDescription() {
        return "红茶";
    }

    @Override
    double getCost() {
        return 8;
    }
}
