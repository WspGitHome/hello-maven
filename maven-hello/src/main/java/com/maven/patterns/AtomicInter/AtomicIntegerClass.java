package com.maven.patterns.AtomicInter;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.Utils
 * @Classname AtomicIntegerClass
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/27 16:41
 * @Version 1.0
 */
public class AtomicIntegerClass {
    //    static int i = 0;
    static AtomicInteger i = new AtomicInteger(0);

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(4);
        new Thread(new add(countDownLatch)).start();
        new Thread(new add(countDownLatch)).start();
        new Thread(new add(countDownLatch)).start();
        new Thread(new add(countDownLatch)).start();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i.get());
    }
}

class add implements Runnable {
    private CountDownLatch countDownLatch;

    add(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        for (int j = 0; j < 1000; j++) {
            AtomicIntegerClass.i.getAndIncrement();
        }
        countDownLatch.countDown();
    }

}

