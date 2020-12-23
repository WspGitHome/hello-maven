package com.maven.stream;

import com.maven.patterns.entity.Student;

import java.util.*;

/**
 * @Packagename com.maven.stream
 * @Classname Main
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/11/12 15:06
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("2323","fadfawe","ezfafeafa","rwrwr","3fsfwfw","frfvfvd");
        System.out.println(list.stream().min(Comparator.comparing(String::length)).get());
        List<Integer> list1 = Arrays.asList(12,21,21,32,233,123,34);
        long count = list1.stream().filter(X -> X > 100).count();
        Integer integer = list1.stream().reduce(1,Integer::max);
        Integer integer1 =list1.stream().reduce(0,(a,b)->a+b);
        System.out.println(count);
        Integer reduce = list1.stream().reduce(0, (a, b) -> a += b.intValue(), Integer::sum);
        double a =0.0;
        if(a==0){
            System.out.println("+++++++++++++++++++++++++++");
        }
    }
}
