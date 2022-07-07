package com.maven.arithmetic;

/**
 * @Packagename com.maven.arithmetic
 * @Classname TongSort
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/04/17 23:40
 * @Version 1.0
 */
public class TongSort {
    public static void main(String[] args) {
        int a[]=new int[]{3,1,5,7,45,3,56,74,9};
        for(int i=0;i<100;i++){
            if(i<=a.length-1 && a[i]==i){
                System.out.println(i);
            }
        }
    }
}
