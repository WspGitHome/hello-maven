package com.maven.practice.version1;

/**
 * @Packagename com.maven.practice.version1
 * @Classname Main
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/10/28 14:11
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        String str = "喜茶加盟！";
        try {
            String s = DataProcesser.applyPreHandle(str);
            String s1 = DataProcesser.applyAfterHandle(s);
            System.out.println("加密:" + s);
            System.out.println("解密:" + s1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
