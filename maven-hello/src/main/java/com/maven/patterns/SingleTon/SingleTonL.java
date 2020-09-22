package com.maven.patterns.SingleTon;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn
 * @Classname SingleTonL
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/29 10:47
 * @Version 1.0
 */
public class SingleTonL {
    private static SingleTonL instance;
    private AtomicInteger id = new AtomicInteger(0);

    private SingleTonL() {
    }

    public static synchronized SingleTonL getInstance() {
        if (instance == null) {
            instance = new SingleTonL();
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }

    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt();
    }
}
