package com.maven.patterns.StrategyPattern.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.StrategyPattern.demo1
 * @Classname MethodStrategyFactory
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/11 10:31
 * @Version 1.0
 */
@Component
public class MethodStrategyFactoryOpt implements ApplicationContextAware, InitializingBean {

    private ApplicationContext applicationContext;

    private static final Map<String, DealMethod> methodMap = new HashMap<>();


    public static DealMethod getStrategyMethod(String type) {
        return methodMap.get(type);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        applicationContext.getBeansOfType(DealMethod.class)
                .values()
                .forEach(dealMethod -> methodMap.put(dealMethod.getMethodName(), dealMethod));
    }
}
