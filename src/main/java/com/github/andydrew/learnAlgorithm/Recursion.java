package com.github.andydrew.learnAlgorithm;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(getSum(5));
    }

    public static int getSum(int number) {
        if (number == 1) {//递归出口
            return 1;//返回1给调用处
        }
        return number + getSum(number - 1);
    }
}
