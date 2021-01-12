package com.maven.patterns.Decorator;

/**
 * @Packagename com.maven.patterns.Decorator
 * @Classname Caramel
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/01/12 14:34
 * @Version 1.0
 */
public class Caramel extends Condiment {
    private Beverage beverage;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    double getCost() {
        //焦糖+1
        return beverage.getCost() + 1;
    }

    @Override
    String getDescription() {
        return beverage.getDescription()+"加焦糖";
    }
}
