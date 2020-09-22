package com.maven.patterns.ChainOfResponsibilityDP.demo1;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.ChainOfResponsibilityDP.demo1
 * @Classname Handler
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/11 13:44
 * @Version 1.0
 */
public interface Handler {
    void dataProcess(StringBuffer dataStr, Handler handler, String strs);
}
