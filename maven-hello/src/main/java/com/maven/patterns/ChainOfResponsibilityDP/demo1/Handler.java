package com.maven.patterns.ChainOfResponsibilityDP.demo1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.ChainOfResponsibilityDP.demo1
 * @Classname Handler
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/11 13:44
 * @Version 1.0
 */
public interface Handler {
    /**
     * @param dataStr 待处理的数据
     * @param handler 下一个处理器
     * @param strs    操作记录
     * @param size    处理器计数
     * @return void
     * @description
     * @authors Mr.Wu
     * @date 2020/09/23
     * @modified by
     * @version 1.0
     **/

    void dataProcess(StringBuffer dataStr, Handler handler, String strs, AtomicInteger size);
}
