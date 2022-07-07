package com.maven.patterns.ChainOfResponsibilityDP.demo2;

/**
 * @Packagename com.maven.patterns.ChainOfResponsibilityDP.demo2
 * @Classname PriceHandlerFactory
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/11/10 14:06
 * @Version 1.0
 */
public class PriceHandlerFactory {
    /**
     * 创建PriceHandler的工厂方法
     * @return
     */
    public static PriceHandler createPriceHandler() {
        PriceHandler sales = new Sales();
        PriceHandler manager = new Manager();
        PriceHandler director = new Director();
        PriceHandler vicePresident = new VicePresident();
        PriceHandler ceo = new CEO();
        //设置直接后继
        sales.setSuccessor(manager);
        manager.setSuccessor(director);
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(ceo);
        return sales;
    }
}
