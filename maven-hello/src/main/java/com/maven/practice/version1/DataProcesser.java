package com.maven.practice.version1;


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

    private static DataProcesser single = new DataProcesser();

    static {
        initProcesser();
    }


    private static void initProcesser() {
        dataProcessList = new ArrayList<>();
        try {
            getAllAcheiveClass();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
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
        Reflections reflections = new Reflections("com.maven");
        Set<Class<? extends HandlerDataProcesser>> typesOfClazz = reflections.getSubTypesOf(HandlerDataProcesser.class);
        String currentClass = new Object() {
            public String getClassName() {
                return this.getClass().getName();
            }
        }.getClassName();
        for (Class<? extends HandlerDataProcesser> clazz : typesOfClazz) {
            if (clazz.getName().contains("$") && clazz.getName().substring(0, clazz.getName().lastIndexOf("$")).equals(currentClass.substring(0, currentClass.lastIndexOf("$")))) {
                continue;
            }
            dataProcessList.add(clazz.newInstance());
        }
        return dataProcessList;
    }
}
