package com.maven.arithmetic;

/**
 * @Packagename com.maven.arithmetic
 * @Classname InsertSort
 * @Description 默认第二个元素为待插入元素，第一个元素为有序的待插入数组，以此类推 第一次为1 ，最后一次为 n-1 累加 n(n-1)/2
 * @Authors Mr.Wu
 * @Date 2020/12/22 15:49
 * @Version 1.0
 */
public class InsertSort {
    static int[] array = new int[]{20, 3, 12, 9, 34, 1, 45, 32, 10, 55, 21};
//    static int[] array = new int[]{ 3,12,20};

    public static void main(String[] args) {
        method1(array);
        BubbleSort.display(array);
    }

    private static void method2(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];  //存储待排序的元素值

            if (array[i - 1] > temp) {  //比有序数组的最后一个元素要小
                int insertIndex = binarySearch(0, i - 1, temp); //获取应插入位置的下标
                for (int j = i; j > insertIndex; j--) {  //将有序数组中，插入点之后的元素后移一位
                    array[j] = array[j - 1];
                }
                array[insertIndex] = temp;  //插入待排序元素到正确的位置
            }

        }//3,12,20
        System.out.println(binarySearch(0, 2, 9));
    }

    public static int binarySearch(int lowerBound, int upperBound, int target) {
        int curIndex;
        while (lowerBound < upperBound) {
            curIndex = (lowerBound + upperBound) / 2;
            if (array[curIndex] > target) {
                upperBound = curIndex;
            } else {
                lowerBound = curIndex + 1;
            }
        }
        return lowerBound;
    }


    private static void method1(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int toCompare = array[i];
            int postIndex = i - 1;
            while (postIndex >= 0 && array[postIndex] > toCompare) {
                array[postIndex + 1] = array[postIndex];
                postIndex--;
            }
            //[postIndex + 1] -> 往前比较不满足，回退 postIndex--
            array[postIndex + 1] = toCompare;
        }
    }
}
