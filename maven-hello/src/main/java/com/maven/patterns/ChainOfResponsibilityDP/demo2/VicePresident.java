package com.maven.patterns.ChainOfResponsibilityDP.demo2;

/**
 * @Packagename com.maven.patterns.ChainOfResponsibilityDP.demo2
 * @Classname VicePresident
 * @Description 销售副总裁，可以批准50%以内的折扣
 * @Authors Mr.Wu
 * @Date 2021/11/10 11:40
 * @Version 1.0
 */
public class VicePresident extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        if(discount <= 0.5){
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(),discount);
        }else{//超过直接传递给直接后继
            successor.processDiscount(discount);
        }
    }

}