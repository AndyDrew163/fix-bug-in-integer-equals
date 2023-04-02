package com.github.andydrew.learnAlgorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {23, 232, 66, 33, 67, 28, 123, 24, 65, 43, 445, 778, 3333, 999};
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.print(arr[i]);
            }
        }
    }

    public int[] bubbleSort(int[] arr) {
        int count = 0;//int[] arr = {23, 232, 66, 33, 67};如n=5
        for (int i = 0; i < arr.length - 1; i++) {//冒泡排序外循环，循环次数为数组元素个数n-1=4
            count = arr.length - i - 1;
            for (int j = 0; j < count; j++) {//冒泡排序内循环，循环次数为逐次n-i
                if (arr[j] > arr[j + 1]) {//若前一个元素大于后一个元素
                    int a = arr[j];//a等于前一个元素
                    int b = arr[j + 1];//b等于后一个元素
                    arr[j] = b;//位置互动调
                    arr[j + 1] = a;
                }
            }
        }
        return arr;
    }
}
