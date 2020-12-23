package com.maven.arithmetic;

/**
 * @Packagename com.maven.arithmetic
 * @Classname MaoPArithMetic
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/12/21 16:27
 * @Version 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{20, 2, 12, 9, 34, 1, 45, 32, 10, 55, 21};
        method1(array);
        display(array);
    }


    public static void display(int[] array) {
        for (int i : array) {
            System.out.print(i + "\t");
        }

    }

    private static void method3(int[] array) {
        int start = 0, end = array.length - 1;
        while (start < end) {
            for (int i = start + 1; i <= end; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            end--;
            for (int j = end; j > start; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
            start++;
        }
    }

    private static void method2(int[] array) {
        int pos = array.length - 1;
        while (pos > 0) {
            int cursor = 1;
            for (int i = 1; i <= pos; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    cursor = i;
                }
            }
            pos = cursor - 1;
        }
    }

    private static void method1(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; ++i) {
            boolean flag = false;
            for (int j = 1; j <= array.length - 1 - i; ++j) {
                System.out.println(++count);
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    private static void method0(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; ++i) {
            for (int j = 1; j <= array.length - 1 - i; ++j) {
                System.out.println(++count);
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
