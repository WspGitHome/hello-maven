package com.maven.patterns.Decorator;

/**
 * @Packagename com.maven.patterns.Decorator
 * @Classname Main
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/01/12 14:35
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Caramel(new Caramel(new Lemo(new BlackTea())));
        System.out.println("价格："+beverage.getCost() +" 口味："+beverage.getDescription());
    }
}
