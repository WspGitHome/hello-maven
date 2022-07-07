package com.maven.patterns.ChainOfResponsibilityDP.demo2;

/**
 * @Packagename com.maven.patterns.ChainOfResponsibilityDP.demo2
 * @Classname PriceHandler
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/11/10 11:38
 * @Version 1.0
 */
public abstract class PriceHandler {

    /**
     * 直接后继，用于传递请求
     * 指向自身类型的引用
     * protected:使子类都可以访问到
     */
    protected PriceHandler successor;

    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }

    /**
     * 处理折扣请求
     * @param discount
     */
    public abstract void processDiscount(float discount);

}