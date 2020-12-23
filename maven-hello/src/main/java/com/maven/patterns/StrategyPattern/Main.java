package com.maven.patterns.StrategyPattern;


import org.springframework.util.Assert;

import java.util.Base64;
import java.util.Random;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.StrategyPattern
 * @Classname Main
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/04 15:00
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Integer a = -129;
        Integer b = -129;
        Random random = new Random(10);
        for(int i =0;i<100;i++){
            System.out.print(  random.nextInt(3));
        }

    }
}
