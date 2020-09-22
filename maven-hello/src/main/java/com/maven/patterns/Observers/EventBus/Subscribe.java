package com.maven.patterns.Observers.EventBus;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.Observers.EventBus
 * @Classname Subscribe
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/03 14:15
 * @Version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Subscribe {
}
