package com.maven.patterns.BridgeDesignPattern;

/**
 * @Packagename com.maven.patterns.BridgeDesignPattern
 * @Classname DrawApi
 * @Description 桥梁模式  （理解代码的抽象和解耦）
 * @Authors Mr.Wu
 * @Date 2021/01/12 13:54
 * @Version 1.0
 */
public interface DrawApi {
     void draw(int radius, int x, int y);
}
