package com.maven.patterns.AnnotationAndEnum;

import java.lang.annotation.*;

/**
 * @Packagename com.wanfangdata.researchers.annotation
 * @Classname ProhibitRepeat
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/31 09:02
 * @Version 1.0
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ProhibitRepeat {
    //默认1秒内不重复提交相同参数的请求
    int interval() default 1;
}
