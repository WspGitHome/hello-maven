package com.maven.patterns.BridgeDesignPattern;

/**
 * @Packagename com.maven.patterns.BridgeDesignPattern
 * @Classname RedPen
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/01/12 13:56
 * @Version 1.0
 */
public class RedPen implements DrawApi {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用红色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
