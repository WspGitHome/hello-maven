package com.maven.practice;


import org.reflections.Reflections;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.ChainOfResponsibilityDP.demo1
 * @Classname DataProcesser
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/09/22 15:46
 * @Version 1.0
 */
public class DataProcesser {

    private static List<HandlerDataProcesser> dataProcessList;

    private static HandlerDataProcesser[] dataProcesser;

    private static ArrayList<Class> achieveClass = new ArrayList<>();

    private static DataProcesser single = new DataProcesser();

    static {
        initProcesser();
    }


    private static void initProcesser() {
        dataProcessList = new ArrayList<>();
        if (!ObjectUtils.isEmpty(achieveClass)) {
            dataProcessList.add((HandlerDataProcesser) achieveClass);
        }
    }

    private String preHandle(String data) throws Exception {
        HandlerDataProcesser[] dataProcesses = getDataProcesses();
        if (!StringUtils.isEmpty(dataProcesses)) {
            for (int i = dataProcesses.length - 1; i >= 0; i--) {
                HandlerDataProcesser dataProcesser = dataProcesses[i];
                data = dataProcesser.preDataProcess(data);

            }
        }
        return data;
    }

    public static String applyPreHandle(String data) throws Exception {
        return single.preHandle(data);
    }


    public String afterHandle(String data) throws Exception {
        HandlerDataProcesser[] dataProcesses = getDataProcesses();
        if (!StringUtils.isEmpty(dataProcesses)) {
            for (int i = 0; i <= dataProcesses.length - 1; i++) {
                HandlerDataProcesser dataProcesser = dataProcesses[i];
                data = dataProcesser.afterDataProcess(data);

            }
        }
        return data;
    }


    public static String applyAfterHandle(String data) throws Exception {
        return single.afterHandle(data);
    }

    private HandlerDataProcesser[] getDataProcesses() {
        if (dataProcesser == null) {
            //无实现类是使用默认实现返回data;
            if (ObjectUtils.isEmpty(dataProcessList)) {
                dataProcessList.add(new HandlerDataProcesser() {
                });
            }
            dataProcesser = dataProcessList.toArray(new HandlerDataProcesser[0]);
        }
        return dataProcesser;
    }

    private static List<HandlerDataProcesser> getAllAcheiveClass() throws IllegalAccessException, InstantiationException {
        Reflections reflections = new Reflections(HandlerDataProcesser.class.getPackage().getName());
        Set<Class<? extends HandlerDataProcesser>> typesOfClazz = reflections.getSubTypesOf(HandlerDataProcesser.class);
        for (Class<? extends HandlerDataProcesser> clazz : typesOfClazz) {
            dataProcessList.add(clazz.newInstance());
        }
        return dataProcessList;
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        getAllAcheiveClass();
    }
}
