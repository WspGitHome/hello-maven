package com.maven.patterns.Facade;

/**
 * @Packagename com.maven.patterns.Facade
 * @Classname Main
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/01/12 14:46
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.makeCircle();
        shapeMaker.makeSquare();
        //......
    }
}
