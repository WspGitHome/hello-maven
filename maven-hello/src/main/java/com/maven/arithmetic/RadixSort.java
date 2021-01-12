package com.maven.arithmetic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Packagename com.maven.arithmetic
 * @Classname DiaxSort
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/01/04 11:14
 * @Version 1.0
 */
public class RadixSort {
    int array[];

    public RadixSort(int[] array) {
        this.array = array;
    }

    private void sort() {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        int keyNum = 0;
        while (max > 0) {
            max = max / 10;
            keyNum++;
        }

        List<ArrayList<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            buckets.add(new ArrayList<>());
        }
        for (int i = 0; i < keyNum; i++) {
            for (int j = 0; j < array.length; j++) {
                int key = array[j] % (int) Math.pow(10, i + 1) / (int) Math.pow(10, i);
                buckets.get(key).add(array[j]);
            }
            int counter = 0;
            for (int j = 0; j < 10; j++) {
                List<Integer> bucket = buckets.get(j);
                while (bucket.size() > 0) {
                    array[counter++] = bucket.remove(0);
                }
            }
        }


    }

    public static void main(String[] args) {
        int[] array = new int[]{6, 4, 20, 2, 12, 9, 34,15, 999, 323, 3, 56, 76, 1, 5};
        RadixSort radixSort = new RadixSort(array);
        radixSort.sort();
        BubbleSort.display(array);
//6,4,20,2,12,9,34,15,999,323,3,56,76,1,5
//20,1,2,12,323,3,4,34,15,5,6,56,76,9,999
//1,2,3,4,5,6,9,12,15,20,323,34,56,76,999
//1,2,3,4,5,6,9,12,15,20,34,56,76,323,999
    }
}
