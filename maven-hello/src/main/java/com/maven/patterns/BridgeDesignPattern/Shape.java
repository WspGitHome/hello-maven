package com.maven.patterns.BridgeDesignPattern;

/**
 * @Packagename com.maven.patterns.BridgeDesignPattern
 * @Classname Shape
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/01/12 13:57
 * @Version 1.0
 */
public abstract class Shape {
    protected DrawApi drawApi;

    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    abstract void draw();
}
