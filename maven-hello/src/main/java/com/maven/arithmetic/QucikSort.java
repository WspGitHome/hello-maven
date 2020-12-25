package com.maven.arithmetic;

import java.util.Queue;

/**
 * @Packagename com.maven.arithmetic
 * @Classname QucikSort
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/12/24 16:13
 * @Version 1.0
 */
public class QucikSort {
    int array[];

    public QucikSort(int[] array) {
        this.array = array;
    }

    private void toQuickSort() {
        resolveSort(0, array.length - 1);
//        qucikSort(0, array.length - 1,1);
        BubbleSort.display(array);

    }

    private void resolveSort(int low, int up) {
        if (low >= up) {
            return;
        } else {
            int povit = array[up];
            int i = qucikSort(low, up, povit);
            resolveSort(low, i - 1);
            resolveSort(i + 1, up);
        }
    }
//1,6,5, 4, 20,3, 2, 12,
//1,6,5, 4, 20,3, 2, 12,


    private int qucikSort(int low, int high, int povit) {
        while (low < high) {
            while (low < high && array[low] <= povit) {
                low++;
            }
            swap(low, high);
            while (low < high && array[high] >= povit) {
                high--;
            }
            swap(low, high);
        }
        return low;
    }


    private void swap(int low, int high) {
        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[]{6, 4, 20, 2, 12, 9, 34, 999, 323, 3, 56, 76, 1, 5};
//        int[] array = new int[]{1, 6, 5, 4, 20, 3, 2, 12};
        QucikSort sort = new QucikSort(array);
        sort.toQuickSort();
    }
}
