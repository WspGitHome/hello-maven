package com.maven.patterns.AnnotationAndEnum.test1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @Packagename com.maven.patterns.AnnotationAndEnum.test1
 * @Classname RetationClass
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/12/17 15:06
 * @Version 1.0
 */
public class RetationClass {

    @RetationAnnotation(world = "China", place = "beijing")
    public void outPut() {
        System.out.println("out put method!");
    }

    public static void main(String[] args) throws Exception {
        Class<RetationClass> classClass = RetationClass.class;
        Method method = classClass.getMethod("outPut");
        if (method.isAnnotationPresent(RetationAnnotation.class)) {
            RetationAnnotation annotation = method.getAnnotation(RetationAnnotation.class);
            System.out.println(annotation.hello());
            System.out.println(annotation.world());
            System.out.println(annotation.place());
        }
        Annotation[] annotations = method.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.annotationType().getName());
        }

    }
}
