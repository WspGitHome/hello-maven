package com.maven.practice.version1;

/**
 * @Packagename com.maven.practice
 * @Classname HandlerDataProcess
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/10/12 14:28
 * @Version 1.0
 */
public interface HandlerDataProcesser {

    default String preDataProcess(String data) throws Exception {
        return data;
    }

    default String afterDataProcess(String data) throws Exception {
        return data;
    }
}
