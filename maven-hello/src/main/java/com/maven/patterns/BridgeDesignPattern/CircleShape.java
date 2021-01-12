package com.maven.patterns.BridgeDesignPattern;

/**
 * @Packagename com.maven.patterns.BridgeDesignPattern
 * @Classname CircleShape
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/01/12 13:59
 * @Version 1.0
 */
public class CircleShape extends Shape {
    private int radius;

    public CircleShape(int radius, DrawApi drawApi) {
        super(drawApi);
        this.radius = radius;
    }

    @Override
    void draw() {
        drawApi.draw(radius, 0, 0);
    }
}
