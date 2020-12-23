package com.maven.patterns.SingleTon;

import com.maven.patterns.entity.Student;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn
 * @Classname StaticSingleTon
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/29 10:58
 * @Version 1.0
 */
public class StaticSingleTon {
    private StaticSingleTon() {
    }

    private static class SingletonHolder {
        private static final StaticSingleTon instance = new StaticSingleTon();
    }

    public static StaticSingleTon getInstance() {
        return SingletonHolder.instance;
    }

}
