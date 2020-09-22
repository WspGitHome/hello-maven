package com.maven.patterns.StrategyPattern;


import java.util.Base64;

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
        String str = "sunlight doesn't sunshine!/阳光~";
        String encodeStr = Base64.getEncoder().encodeToString(str.getBytes());
        byte[] bytes = encodeStr.getBytes();
        byte[] decode = Base64.getDecoder().decode(bytes);
    }
}
