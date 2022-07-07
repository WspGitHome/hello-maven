package com.maven.patterns.ChainOfResponsibilityDP.demo2;

/**
 * @Packagename com.maven.patterns.ChainOfResponsibilityDP.demo2
 * @Classname Sales
 * @Description 销售人员，可以批准5%以内的折扣
 * @Authors Mr.Wu
 * @Date 2021/11/10 11:38
 * @Version 1.0
 */
public class Sales extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        if(discount <= 0.05){
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(),discount);
        }else{//让直接后继来处理
            successor.processDiscount(discount);
        }
    }

}