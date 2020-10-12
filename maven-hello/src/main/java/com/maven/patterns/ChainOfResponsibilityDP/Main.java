package com.maven.patterns.ChainOfResponsibilityDP;


import com.maven.patterns.ChainOfResponsibilityDP.demo1.DataProcesser;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.ChainOfResponsibilityDP
 * @Classname Main
 * @Description 职责链模式和策略模式我觉得很像，本质上都可以当做 if else 的解耦行为。
 * 两者的不同主要体现判断的条件下：策略模式在传入参数的时候就可以根据参数先进行判断，然后觉得使用哪一个策略；
 * 但是职责链模式的参数是无法提前判断的，先要由链路上的函数处理。不经过一系列的判断，是无法提前知道的。
 * @Authors Mr.Wu
 * @Date 2020/08/11 11:12
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2000);
        CountDownLatch follower = new CountDownLatch(2000);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            service.execute(() -> task(follower));
        }
        try {
            follower.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }
        System.out.println("take time:" + (System.currentTimeMillis() - start));
    }

    private static void task(CountDownLatch countDownLatch) {
        List<String> operations = new ArrayList<>();
        String str = "Today Weather Is Bad ! / 今天天气很糟糕~";
        //Base64加密
        str = Base64.getEncoder().encodeToString(str.getBytes());
        //记录操作
        operations.add("base64");
        //拼接随机字符
        str = str + "13sdhjfhaf382fakf";
        //记录操作
        operations.add("append:13sdhjfhaf382fakf");
        //拼接随机字符
        str = str + "@&^($(#&FHJEHKF~!";
        //记录操作
        operations.add("append:@&^($(#&FHJEHKF~!");
        //Base64再加密
        str = Base64.getEncoder().encodeToString(str.getBytes());
        //记录操作
        operations.add("base64");
        //System.out.println(System.currentTimeMillis() + "线程：" + Thread.currentThread().getName() + ">加密完成后字符：" + str);
        //拼接随机字符
        byte[] bytes = str.getBytes();
        String result = null;
        try {
            result = DataProcesser.processData(bytes, operations);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        // System.out.println(System.currentTimeMillis() + "线程：" + Thread.currentThread().getName() + ">解密完成后字符：" + result);
        countDownLatch.countDown();
    }
}
