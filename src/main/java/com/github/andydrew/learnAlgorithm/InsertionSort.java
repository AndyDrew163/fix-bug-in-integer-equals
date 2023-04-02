package com.github.andydrew.learnAlgorithm;

public class InsertionSort {
    public static void main(String[] args) {
        long x = System.currentTimeMillis();
        int[] arr = {23, 66, 67, 555, 61, 28, 123, 24, 65, 43, 445, 778, 3333, 999};
        InsertionSort is = new InsertionSort();
        is.insertionSort(arr);
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

    public int[] insertionSort(int[] arr) {
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {//14 lenth15
            if (arr[i] > arr[i + 1]) {//若前面一个元素大于后一个元素，那么开始分组，第一组有序数组索引为0~i
                startIndex = i + 1;//第二组无序数组索引为startIndex~arr.length-1
                break;
            }
        }
        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {  //若后一个元素小于前一个元素
                int a = arr[j - 1];//a等于前一个元素
                int b = arr[j];//b等于后一个元素
                arr[j] = a;//位置互换
                arr[j - 1] = b;
                j--;
            }
        }
        return arr;
    }
}
