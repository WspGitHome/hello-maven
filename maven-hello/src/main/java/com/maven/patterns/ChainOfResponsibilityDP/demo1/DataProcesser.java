package com.maven.patterns.ChainOfResponsibilityDP.demo1;

import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.ChainOfResponsibilityDP.demo1
 * @Classname DataProcesser
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/09/22 15:46
 * @Version 1.0
 */
public class DataProcesser {

    private DataProcesser() {

    }

    public static String processData(byte[] bytes, List<String> strs) throws UnsupportedEncodingException {
        if (strs == null || strs.size() == 0) {
            return new String(bytes, "utf-8");
        }
        Collections.reverse(strs);
        StringBuffer sb = new StringBuffer();
        sb.append(new String(bytes, "utf-8"));
        strs.stream().forEach(e -> {
            HandlerChain.getInstance().dataProcess(sb, (dataStr, handler, strs1, size) -> {
            }, e, new AtomicInteger(0));
        });
        return sb.toString();
    }

    public static String processData(byte[] bytes) throws UnsupportedEncodingException {
        return processData(bytes, null);
    }
}
