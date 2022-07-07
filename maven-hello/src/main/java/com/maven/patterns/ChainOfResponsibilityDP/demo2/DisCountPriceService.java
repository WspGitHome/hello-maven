package com.maven.patterns.ChainOfResponsibilityDP.demo2;

import java.util.Random;

/**
 * @Packagename com.maven.patterns.ChainOfResponsibilityDP.demo2
 * @Classname Customer
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/11/10 11:46
 * @Version 1.0
 */
public class DisCountPriceService {

    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    //只关心折扣请求是否被处理了，不关心被谁处理的。
    public void requestDiscount(float discount){
        priceHandler.processDiscount(discount);
    }

}
