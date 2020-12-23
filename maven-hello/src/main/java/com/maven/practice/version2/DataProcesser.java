package com.maven.practice.version2;


import java.util.HashMap;
import java.util.Map;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.ChainOfResponsibilityDP.demo1
 * @Classname DataProcesser
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/09/22 15:46
 * @Version 1.0
 */
public class DataProcesser {

    private final static Map<String, HandlerDataProcesser> processerMap = new HashMap<>();

    private static DataProcesser singleTon = new DataProcesser();

    public static final String SPLIT_FLAG = "#@#@#";

    static {
        processerMap.put("1", new Base64DataProcess());
        processerMap.put("2", new EncryptionDataProcess());
    }


    private String preHandle(String flag, String data) throws Exception {
        HandlerDataProcesser processer = processerMap.get(flag);
        if (processer != null) {
            return flag + SPLIT_FLAG + processer.preDataProcess(data);
        }
        return data;
    }

    /**
     * @param flag 加密方式标识
     * @param data 待处理数据
     * @return java.lang.String 加密处理完成的数据
     * @description
     * @authors Mr.Wu
     * @date 2020/10/28
     * @modified by
     * @version 1.0
     **/

    public static String applyPreHandle(String flag, String data) throws Exception {
        return singleTon.preHandle(flag, data);
    }


    public String afterHandle(String data) throws Exception {
        if (data.contains(SPLIT_FLAG)) {
            String[] dataSplit = data.split(SPLIT_FLAG);
            return processerMap.get(dataSplit[0]).afterDataProcess(dataSplit[1]);
        }
        return data;

    }


    /**
     * @param data zk取回的数据
     * @return java.lang.String 解密完成的数据
     * @description
     * @authors Mr.Wu
     * @date 2020/10/28
     * @modified by
     * @version 1.0
     **/

    public static String applyAfterHandle(String data) throws Exception {
        return singleTon.afterHandle(data);
    }

}
