package com.maven.patterns.Facade;

/**
 * @Packagename com.maven.patterns.Facade
 * @Classname ShapeMaker
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/01/12 14:44
 * @Version 1.0
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void makeCircle() {
        circle.draw();
    }

    public void makeRectangle() {
        rectangle.draw();
    }

    public void makeSquare() {
        square.draw();
    }
}
