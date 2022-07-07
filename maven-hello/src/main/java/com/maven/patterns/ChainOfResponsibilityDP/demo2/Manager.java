package com.maven.patterns.ChainOfResponsibilityDP.demo2;

/**
 * @Packagename com.maven.patterns.ChainOfResponsibilityDP.demo2
 * @Classname Manager
 * @Description 销售经理，可以批准30%以内的折扣
 * @Authors Mr.Wu
 * @Date 2021/11/10 11:39
 * @Version 1.0
 */
public class Manager extends PriceHandler{

    @Override
    public void processDiscount(float discount) {
        if(discount <= 0.3){
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(),discount);
        }else{//超过直接传递给直接后继
            successor.processDiscount(discount);
        }

    }

}

