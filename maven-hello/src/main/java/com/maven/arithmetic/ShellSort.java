package com.maven.arithmetic;

/**
 * @Packagename com.maven.arithmetic
 * @Classname ShellSort
 * @Description 插入排序基础上优化，解决插入排序中较小元素位于末端造成的前置元素不断后移造成的效率损失
 * 希尔排序不像其他时间复杂度为O(N*log2N)的排序算法那么快，但是比选择排序和插入排序这种时间复杂度为O(N2)的排序算法还是要快得多 希尔排序的平均时间复杂度为O(N*(logN)2)。
 * @Authors Mr.Wu
 * @Date 2020/12/29 10:08
 * @Version 1.0
 */
public class ShellSort {

    int array[];

    public ShellSort(int[] array) {
        this.array = array;
    }

    private void shellSort() {
        // h 间隔序列生成方法是由 Donald Knuth提出来的
        int h = 1;
        while ((3 * h + 1) < array.length) {
            h = 3 * h + 1;
        }

        while (h > 0) {
            //h 间隔数也是划的组数
            for (int i = 0; i < h; i++) {
                //对间隔为h的元素组进行插入排序
                shellIntelSort(i, h);
            }
            h = (h - 1) / 3;
        }
    }

    private void shellIntelSort(int beginIndex, int increatment) {
        int targetIndex = beginIndex + increatment;
        while (targetIndex < array.length) {
            int temp = array[targetIndex];
            int previousIndex = targetIndex - increatment;
            while (previousIndex >= 0 && array[previousIndex] > temp) {
                array[previousIndex + increatment] = array[previousIndex];
                previousIndex = previousIndex - increatment;
            }
            array[previousIndex + increatment] = temp;
            targetIndex = targetIndex + increatment;
        }

    }

    public static void main(String[] args) {
        int[] array = new int[]{6, 4, 20, 2, 12, 34, 9, 999, 323, 3, 76, 56, 1, 5};
//        int[] array = new int[]{1, 6, 5, 4, 20, 3, 2, 12};
        ShellSort shellSort = new ShellSort(array);
        shellSort.shellSort();
        BubbleSort.display(array);

        // 1 20 , 6 3 , 5 2 ,4 12
        // 1 3 2 4 20 6 5 12
        //
    }
}
