package com.maven.patterns.ChainOfResponsibilityDP.demo2;

/**
 * @Packagename com.maven.patterns.ChainOfResponsibilityDP.demo2
 * @Classname CEO
 * @Description  * CEO，可以批准55%以内的折扣
 *    折扣超出55%，拒绝申请
 * @Authors Mr.Wu
 * @Date 2021/11/10 11:40
 * @Version 1.0
 */
public class CEO extends PriceHandler{

    @Override
    public void processDiscount(float discount) {
        if(discount <= 0.55){
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(),discount);
        }else{//让直接后继来处理
            System.out.format("%s拒绝了折扣：%.2f%n", this.getClass().getName(),discount);
        }

    }

}