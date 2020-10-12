package com.maven.patterns.ChainOfResponsibilityDP.demo1;


import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.ChainOfResponsibilityDP.demo1
 * @Classname HandlerA
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/11 13:45
 * @Version 1.0
 */
public class HandlerBase64Decode implements Handler {

    @Override
    public void dataProcess(StringBuffer dataStr, Handler handler, String strs, AtomicInteger size) {
        size.incrementAndGet();
        if (strs.contains("base64")) {
            try {
                String subString = new String(Base64.getDecoder().decode(dataStr.toString().getBytes()), "utf-8");
                dataStr.replace(0, dataStr.length(), subString);
                return;
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        HandlerChain chain = new HandlerChain();
        chain.dataProcess(dataStr, handler, strs, size);
    }
}