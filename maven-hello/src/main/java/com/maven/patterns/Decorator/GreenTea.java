package com.maven.patterns.Decorator;

/**
 * @Packagename com.maven.patterns.Decorator
 * @Classname GreenTea
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/01/12 14:29
 * @Version 1.0
 */
public class GreenTea extends Beverage{
    @Override
    String getDescription() {
        return "绿茶";
    }

    @Override
    double getCost() {
        return 10;
    }
}
