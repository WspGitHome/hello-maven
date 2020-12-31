package com.maven.arithmetic;

/**
 * @Packagename com.maven.arithmetic
 * @Classname MergeSort
 * @Description 两个有序的数组比较合并为一个有序数组，利用二分，初始比较两个单数 层数为log2N，复制N个元素，为Nlog2N  2Nlog2N
 * @Authors Mr.Wu
 * @Date 2020/12/23 16:44
 * @Version 1.0
 */
public class MergeSort {

    int[] arrayInit;
    static int[] array;

    public MergeSort(int[] arrayInit) {
        this.arrayInit = arrayInit;
    }

    private void sortMerge() {
        array = new int[arrayInit.length];
        resolveMerge(array, 0, arrayInit.length - 1);
    }

    private void resolveMerge(int[] array, int start, int end) {
        if (start == end) {
            return;
        } else {
            int mid = (start + end) / 2;
            resolveMerge(array, start, mid);
            resolveMerge(array, mid + 1, end);
            mergeArray(array, start, mid, end);
        }
    }

    private void mergeArray(int[] array, int lowBound, int mid, int upBound) {
        int lowBegin = lowBound, lowEnd = mid;
        int upBegin = mid + 1, upEnd = upBound;
        int k = 0;
        int n = upBound - lowBound + 1;
        while (lowBegin <= lowEnd && upBegin <= upEnd) {
            if (arrayInit[lowBegin] < arrayInit[upBegin]) {
                array[k++] = arrayInit[lowBegin++];
            } else {
                array[k++] = arrayInit[upBegin++];
            }
        }
        while (upBegin <= upEnd) {
            array[k++] = arrayInit[upBegin++];
        }
        while (lowBegin <= lowEnd) {
            array[k++] = arrayInit[lowBegin++];
        }
        for (int j = 0; j < n; j++) {
            arrayInit[lowBound++] = array[j];
        }
    }


    public static void main(String[] args) {
        int[] array = new int[]{6, 4, 20, 2, 12, 9, 34, 999, 323, 3, 56, 76, 1, 5};
        MergeSort sort = new MergeSort(array);
        sort.sortMerge();
        BubbleSort.display(MergeSort.array);
    }

}
