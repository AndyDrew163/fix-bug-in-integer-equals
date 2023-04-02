package com.github.andydrew.learnAlgorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 8, 12, 22, 33, 45, 54, 67, 75, 76, 88, 98, 112, 222};
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(arr, 8));
    }

    public int binarySearch(int[] arr, int number) {//二分查找：前提必须是有序数组或集合才可使用。
        int min = 0;//记录初始开始索引
        int max = arr.length - 1;//记录初始结束索引
        while (true) {
            if (min > max) {
                System.out.println("该数据不存在");
                return -1;
            }
            int mid = (min + max) / 2;//当前数组的中间索引，随着每次的循环，根据min或max变动
            if (arr[mid] > number) {//若mid中间值大于number，那么number在mid索引的左边
                max = mid - 1;
            } else if (arr[mid] < number) {//若mid中间值小于number，那么number在mid索引的右边
                min = mid + 1;
            } else {//若arr[mid] == number，那么返回当前索引mid
                return mid;
            }
        }
    }
}
