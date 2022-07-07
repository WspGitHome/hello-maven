package com.maven.patterns.TemplatePattern.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Packagename com.maven.patterns.TemplatePattern.demo1
 * @Classname PayFlowAbstract
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/11/10 14:25
 * @Version 1.0
 */
public abstract class PayFlowAbstract {

    private static final Logger logger = LoggerFactory.getLogger("支付流程");

    /**
     * 模版方法 校验参数合法性->支付->更新用户订单->支付成功后授权
     */
    @Transactional(rollbackFor = Exception.class)
    public synchronized void payExecute() throws Exception {
        checkPayCondition();//校验订单及参数合法性
        pay();//扣款逻辑
        completeOrder();//更新订单状态
        payAfterHandle();//购买成功后进行数据授权
    }

    //抽象授权逻辑
    protected abstract void payAfterHandle();

    //公用的更新订单逻辑
    private void completeOrder() {
        logger.info("更新订单状态~");
    }

    //公用的支付逻辑
    private void pay() {
        logger.info("执行扣款逻辑~");
    }

    //公用校验参数逻辑
    private void checkPayCondition() {
        logger.info("校验订单及参数合法性~");
    }


}

