package com.maven.practice;

/**
 * @Packagename com.maven.practice
 * @Classname EncryptionDataProcess
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/10/12 14:32
 * @Version 1.0
 */
public class EncryptionDataProcess implements HandlerDataProcesser {
    @Override
    public String preDataProcess(String data) throws Exception {
        return EncrypDES.encrypt(data);
    }

    @Override
    public String afterDataProcess(String data) throws Exception {
        return EncrypDES.decrypt(data);
    }
}
