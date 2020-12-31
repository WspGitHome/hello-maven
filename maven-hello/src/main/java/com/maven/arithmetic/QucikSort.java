package com.maven.arithmetic;


/**
 * @Packagename com.maven.arithmetic
 * @Classname QucikSort
 * @Description 选取基准元素，使其左右元素分别小于大于改元素，利用二分递归完成。  n*log2n
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
        BubbleSort.display(array);

    }

    private void resolveSort(int low, int up) {
        if (low >= up) {
            return;
        } else {
            int pivot = array[low];
            int i = qucikSort(low, up, pivot);
            resolveSort(low, i - 1);
            resolveSort(i + 1, up);
        }
    }


    private int qucikSort(int low, int high, int povit) {
        while (low < high) {
            while (low < high && array[high] >= povit) {
                high--;
            }
            swap(low, high);
            while (low < high && array[low] <= povit) {
                low++;
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
        int[] array = new int[]{6, 4, 20, 2, 12, 34,9, 999, 323, 3, 76, 56, 1, 5};
//        int[] array = new int[]{1, 6, 5, 4, 20, 3, 2, 12};
        QucikSort sort = new QucikSort(array);
        sort.toQuickSort();
    }

}
