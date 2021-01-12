package com.maven.patterns.Facade;

/**
 * @Packagename com.maven.patterns.Facade
 * @Classname Circle
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/01/12 14:42
 * @Version 1.0
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
