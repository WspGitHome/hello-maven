package com.maven.arithmetic;

import java.util.Random;

/**
 * @Packagename com.maven.arithmetic
 * @Classname SelectionSort
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/12/22 10:28
 * @Version 1.0
 */
public class SelectionSort {
    public static void main(String[] args) {
//        int[] array = new int[]{6,4,20, 2, 12, 9, 34, 999, 323, 3, 56, 76, 1, 5};
        int []array = new int[20000];
        Random random = new Random();
        for(int a=0;a<20000;a++){
            array[a] = random.nextInt(100000);
        }
        long start = System.currentTimeMillis();
        method2(array);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis()-start);
        BubbleSort.display(array);
    }


    private static void method2(int[] array) {
        int minPoint, maxPoint, temp;
        int useLength = array.length;
        for (int i = 0; i < array.length / 2; i++) {
            minPoint = i;
            maxPoint = array.length - 1 - i;
            for (int j = i; j <= (useLength - 1 - i); j++) {
                if (array[minPoint] > array[j]) {
                    minPoint = j;
                }
                if (array[maxPoint] < array[j]) {
                    maxPoint = j;
                }
            }
            if (minPoint != i) {
                temp = array[i];
                array[i] = array[minPoint];
                array[minPoint] = temp;
                if (i == maxPoint) {
                    maxPoint = minPoint;
                }
            }
            if (maxPoint != array.length - 1 - i) {
                temp = array[array.length - 1 - i];
                array[array.length - 1 - i] = array[maxPoint];
                array[maxPoint] = temp;
            }
        }
    }

    private static void method1(int[] array) {
        int temp, minPoint;
        for (int i = 0; i < array.length - 1; i++) {
            minPoint = i;
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (array[minPoint] > array[j]) {
                    minPoint = j;
                }
            }
            if (minPoint != i) {
                temp = array[i];
                array[i] = array[minPoint];
                array[minPoint] = temp;
            }
        }
    }
}
