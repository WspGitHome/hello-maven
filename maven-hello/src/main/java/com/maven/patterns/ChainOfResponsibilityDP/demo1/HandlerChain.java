package com.maven.patterns.ChainOfResponsibilityDP.demo1;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.ChainOfResponsibilityDP.demo1
 * @Classname HandlerChain
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/11 13:52
 * @Version 1.0
 */
public class HandlerChain implements Handler {

    private static List<Handler> handlers = new ArrayList<>();
    private static HandlerChain handlerChain;

    static {
        handlers.add(new HandlerBase64Decode());
        handlers.add(new HandlerAppendDelete());
    }

    public static HandlerChain getInstance() {
        if (handlerChain == null) {
            handlerChain = new HandlerChain();
        }
        return handlerChain;
    }

    @Override
    public void dataProcess(StringBuffer dataStr, Handler hd, String strs, AtomicInteger index) {
        if (index.intValue() == handlers.size()) {
            return;
        }
        Handler handler = handlers.get(index.intValue());
        handler.dataProcess(dataStr, hd, strs, index);
    }
}
