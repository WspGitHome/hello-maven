package com.maven.patterns.SingleTon;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn
 * @Classname DoubleCheckSingle
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/29 10:52
 * @Version 1.0
 */
public class DoubleCheckSingle {
    //低版本的jdk需要加 volatile
    private static volatile DoubleCheckSingle instance;

    private DoubleCheckSingle() {
    }

    public static DoubleCheckSingle getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingle.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingle();
                }
            }
        }
        return instance;
    }
}
