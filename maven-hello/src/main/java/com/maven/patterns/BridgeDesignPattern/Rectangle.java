package com.maven.patterns.BridgeDesignPattern;

/**
 * @Packagename com.maven.patterns.BridgeDesignPattern
 * @Classname Rectangle
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/01/12 14:02
 * @Version 1.0
 */
public class Rectangle extends Shape {
    private int x;
    private int y;

    public Rectangle(DrawApi drawApi, int x, int y) {
        super(drawApi);
        this.x = x;
        this.y = y;
    }

    @Override
    void draw() {
        drawApi.draw(0, x, y);
    }
}
