package com.maven.hellomaven.hellotest;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Packagename com.maven.hellomaven.hellotest
 * @Classname AssertTest
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/09/15 15:49
 * @Version 1.0
 */
public class AssertTest {


    @Test
    public void testAssert() {
        List<String> list = new ArrayList<>();
        //I for(S s:list)   <==
        //fori  for( int i ;i<; i++) <==
        //itar  more than fori
        //itli  List for loop       <==
        //itco  iterator for loop
        //itit iterator while loop
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            String i1 = String.valueOf(random.nextInt(100) + 1);
            if (list.contains(i1)) {
                continue;
            }
            list.add(String.valueOf(i1));
        }
        List<String> collect = list.stream().sorted(Comparator.comparingInt(e -> Integer.parseInt(e))).collect(Collectors.toList());
        String dada = String.join(",", list);

        System.out.println(dada);

    }

    @Test
    public void testOptional() {
        List<String> list = new ArrayList<>();
        List<String> list1 = Optional.of(list).orElse(new ArrayList<>());
        System.out.println(1);
    }

}
