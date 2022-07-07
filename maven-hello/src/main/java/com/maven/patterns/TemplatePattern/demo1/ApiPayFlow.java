package com.maven.patterns.TemplatePattern.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Packagename com.maven.patterns.TemplatePattern.demo1
 * @Classname ApiPayFlow
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/11/10 14:36
 * @Version 1.0
 */
public class ApiPayFlow extends PayFlowAbstract{

    private static final Logger logger = LoggerFactory.getLogger("Api授权");

    @Override
    protected void payAfterHandle() {
        logger.info("具体的API授权实现");
    }
}
