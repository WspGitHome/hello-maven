package com.maven.patterns.SingleTon;



/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn
 * @Classname StaticSingleTon
 * @Description 嵌套类
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
