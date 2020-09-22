package com.maven.patterns.IteratorDesignPattern;

import java.util.*;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.IteratorDesignPattern
 * @Classname Main
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/14 09:41
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator<Integer> iterator1 = list.iterator();
        Iterator<Integer> iterator2 = list.iterator();
        iterator1.next();
        iterator1.remove();
//        iterator2.next();
    }
}
