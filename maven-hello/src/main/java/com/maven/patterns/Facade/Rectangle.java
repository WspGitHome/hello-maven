package com.maven.patterns.Facade;

/**
 * @Packagename com.maven.patterns.Facade
 * @Classname Circle
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/01/12 14:42
 * @Version 1.0
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
