package com.maven.patterns.AnnotationAndEnum.test1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Packagename com.maven.patterns.AnnotationAndEnum.test1
 * @Classname RetationAnnotation
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/12/17 15:05
 * @Version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface RetationAnnotation {
    String hello() default "XiaoMing";

    String world();

    String place();
}
