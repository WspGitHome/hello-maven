package com.maven.patterns.ChainOfResponsibilityDP.demo1;


import java.util.ArrayList;
import java.util.List;

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
    private static int index;

    static {
        handlers.add(new HandlerBase64Decode());
        handlers.add(new HandlerAppendDelete());
    }

    public static HandlerChain getInstance() {
        index = 0;
        return new HandlerChain();
    }

    @Override
    public void dataProcess(StringBuffer dataStr, Handler hd, String strs) {
        if (index == handlers.size()) {
            return;
        }
        Handler handler = handlers.get(index);
        index++;
        handler.dataProcess(dataStr, hd, strs);
    }
}
