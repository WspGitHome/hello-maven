package com.maven.patterns.Decorator;

/**
 * @Packagename com.maven.patterns.Decorator
 * @Classname Lemo
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/01/12 14:31
 * @Version 1.0
 */
public class Lemo extends Condiment {
    private Beverage beverage;

    public Lemo(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    double getCost() {
        //柠檬+3
        return beverage.getCost() + 3;
    }

    @Override
    String getDescription() {
        return beverage.getDescription()+"加柠檬";
    }
}
