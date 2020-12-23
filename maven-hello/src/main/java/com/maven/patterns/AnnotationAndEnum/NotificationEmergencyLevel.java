package com.maven.patterns.AnnotationAndEnum;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn
 * @Classname a
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/30 17:07
 * @Version 1.0
 */
public enum NotificationEmergencyLevel {
    SEVERE, URGENCY, NORMAL, TRIVIAL;
    void print() {
        System.out.println(1111);
    }

    public static void main(String[] args) {
        NotificationEmergencyLevel.NORMAL.print();
    }
}