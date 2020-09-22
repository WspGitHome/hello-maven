package com.maven.patterns.AnnotationAndEnum;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;


/**
 * @Packagename com.wanfangdata.researchers.aop
 * @Classname ProhibitRepeatAspect
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/31 08:59
 * @Version 1.0
 */
@Aspect
@Component
public class ProhibitRepeatAspect {


/*    @Resource
    private RedisTemplate redisTemplate;*/

    @Pointcut("@annotation(com.wanfangdata.researchersbeetlfront.learn.AnnotationAndEnum.ProhibitRepeat)")
    private void serviceNoRepeat() {

    }

    @Around("serviceNoRepeat()")
    public void around(ProceedingJoinPoint joinPoint) {
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        ProhibitRepeat annotation = methodSignature.getMethod().getAnnotation(ProhibitRepeat.class);
        Object[] args = joinPoint.getArgs();
        Object arg = args[0];
        System.out.println(arg.toString());
    /*    redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
        if (redisTemplate.opsForValue().get(arg.toString()) != null) {
            throw new RuntimeException("重复请求");
        }
        redisTemplate.opsForValue().set(arg.toString(), 0, annotation.interval(), TimeUnit.SECONDS);*/
    }
}
