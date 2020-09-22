package com.maven.patterns.AnnotationAndEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn
 * @Classname Season
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/30 17:16
 * @Version 1.0
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.PARAMETER)
public @interface Season {
    int Spring = 1;
    int Summer = 2;
    int Antumn = 3;
    int Winter = 4;

}
