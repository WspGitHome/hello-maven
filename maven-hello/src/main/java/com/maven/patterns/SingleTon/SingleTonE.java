package com.maven.patterns.SingleTon;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn
 * @Classname SingleTonE
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/29 10:43
 * @Version 1.0
 */
public class SingleTonE {
    private static final SingleTonE instance = new SingleTonE();
    private AtomicInteger id = new AtomicInteger(0);

    private SingleTonE() {
    }

    public static SingleTonE getInstance() {
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
    }
}
