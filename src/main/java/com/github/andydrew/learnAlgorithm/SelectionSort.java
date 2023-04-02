package com.github.andydrew.learnAlgorithm;

import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        long x = System.currentTimeMillis();
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(200);
        }
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.println(arr[i]);
            }
        }
        x = System.currentTimeMillis() - x;
        System.out.println("运行时间" + x + "毫秒");
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {//依次选择最小元素调换到最前面
                if (arr[i] > arr[j + 1]) {//第i个元素与后面的元素依次比较，若第i个元素大于后面的元素，则互换位置
                    int a = arr[i];//互换位置
                    int b = arr[j + 1];
                    arr[i] = b;
                    arr[j + 1] = a;
                }
            }
        }
        return arr;
    }
}
