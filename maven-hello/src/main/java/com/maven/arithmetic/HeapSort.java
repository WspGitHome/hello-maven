package com.maven.arithmetic;

/**
 * @Packagename com.maven.arithmetic
 * @Classname HeapSort
 * @Description 堆排序的时间复杂度为O(nlogn)
 * @Authors Mr.Wu
 * @Date 2020/12/30 13:52
 * @Version 1.0
 */
public class HeapSort {
    int array[];

    public HeapSort(int[] array) {
        this.array = array;
    }

    public void heapSort() {
        buildHeap();
        int lastIndex = array.length - 1;
        while (lastIndex > 0) {
            swap(0, lastIndex);
            if (--lastIndex == 0) {
                break;
            }
            adjustHeap(0, lastIndex);
        }

    }

    private void swap(int i, int lastIndex) {
        int temp = array[i];
        array[i] = array[lastIndex];
        array[lastIndex] = temp;
    }

    private void buildHeap() {
        int lastIndex = array.length - 1;
        for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
            adjustHeap(i, lastIndex);
        }
    }

    private void adjustHeap(int rootIndex, int lastIndex) {
        int bigestIndex = rootIndex;
        int leftChildIndex = 2 * rootIndex + 1;
        int rightChildIndex = 2 * rootIndex + 2;
        //存在右节点必存在左节点
        if (rightChildIndex <= lastIndex) {
            if (array[rightChildIndex] > array[rootIndex]
                    || array[leftChildIndex] > array[rootIndex]) {
                bigestIndex = array[rightChildIndex] > array[leftChildIndex] ? rightChildIndex : leftChildIndex;
            }
        } else if (leftChildIndex <= lastIndex) {
            if (array[leftChildIndex] > array[rootIndex]) {
                bigestIndex = leftChildIndex;
            }
        }
        if (bigestIndex != rootIndex) {
            swap(rootIndex, bigestIndex);
            //交换后可能破坏交换位置元素子树
            adjustHeap(bigestIndex, lastIndex);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{6, 4, 20, 2, 12, 34, 9, 999, 323, 3, 76, 56, 1, 5};
//        int[] array = new int[]{1, 6, 5, 4, 20, 3, 2, 12};
        HeapSort sort = new HeapSort(array);
        sort.heapSort();
        BubbleSort.display(array);
    }

}
