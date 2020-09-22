package com.maven.patterns.ChainOfResponsibilityDP.demo1;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.ChainOfResponsibilityDP.demo1
 * @Classname HandlerB
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/11 13:46
 * @Version 1.0
 */
public class HandlerAppendDelete implements Handler {

    @Override
    public void dataProcess(StringBuffer dataStr, Handler handler, String strs) {
        if (strs.contains("append:")) {
            String subString = dataStr.toString().substring(0, dataStr.toString().lastIndexOf(strs.split(":")[1]));
            dataStr.replace(0, dataStr.length(), subString);
            return;
        }
        HandlerChain chain = new HandlerChain();
        chain.dataProcess(dataStr, handler, strs);
    }
}
