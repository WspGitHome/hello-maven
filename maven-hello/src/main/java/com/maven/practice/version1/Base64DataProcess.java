package com.maven.practice.version1;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * @Packagename com.maven.practice
 * @Classname Base64DataProcess
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/10/12 14:31
 * @Version 1.0
 */
public class Base64DataProcess implements HandlerDataProcesser {
    @Override
    public String preDataProcess(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    @Override
    public String afterDataProcess(String data) throws UnsupportedEncodingException {
        return new String(Base64.getDecoder().decode(data.getBytes()),"utf-8");
    }
}
