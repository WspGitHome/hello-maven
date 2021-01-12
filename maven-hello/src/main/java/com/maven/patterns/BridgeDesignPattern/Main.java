package com.maven.patterns.BridgeDesignPattern;

/**
 * @Packagename com.maven.patterns.BridgeDesignPattern
 * @Classname Main
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/01/12 14:03
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Shape circleShape = new CircleShape(3, new RedPen());
        Shape rectangle = new Rectangle(new GreenPen(), 4, 8);
        circleShape.draw();
        rectangle.draw();
    }
}
