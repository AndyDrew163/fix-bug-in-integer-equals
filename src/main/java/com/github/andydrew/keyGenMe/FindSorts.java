package com.github.andydrew.keyGenMe;

import java.util.ArrayList;

public class FindSorts {
    public static ArrayList<GirlFriends> girlsInsertionSort(ArrayList<GirlFriends> girlsList) {//插入排序演示
        int startIndex = 0;
        for (int i = 0; i < girlsList.size(); i++) {
            if (girlsList.get(i).getAge() > girlsList.get(i + 1).getAge()) {
                startIndex = i + 1;//通过for循环找出了有序集合的结束索引：startIndex
                break;
            }
        }
        //无序集合的开始索引：startIndex+1，结束索引：girlsList.size()-1
        for (int i = startIndex; i < girlsList.size(); i++) {//取无序集合的每一个元素出来
            int j = i;
            while (j > 0 && girlsList.get(j).getAge() < girlsList.get(j - 1).getAge()) {//若后一个元素小于前一个元素
                GirlFriends glTemp = girlsList.get(j);//位置互调
                girlsList.set(j, girlsList.get(j - 1));
                girlsList.set(j - 1, glTemp);
                j--;
            }
        }
        return girlsList;
    }

    public static ArrayList<GirlFriends> girlsSelectionSort(ArrayList<GirlFriends> girlsList) {//选择排序演示
        for (int i = 0; i < girlsList.size(); i++) {
            for (int j = i; j < girlsList.size() - 1; j++) {//循环目的为了把最小的调换到最前面
                if (girlsList.get(i).getAge() > girlsList.get(j + 1).getAge()) {//若前面的元素大于后面的元素，互调位置
                    GirlFriends glTemp = girlsList.get(i);//互调位置
                    girlsList.set(i, girlsList.get(j + 1));
                    girlsList.set(j + 1, glTemp);
                }
            }
        }
        return girlsList;
    }

    public static ArrayList<GirlFriends> girlsBubbleSort(ArrayList<GirlFriends> girlsList) {//冒泡排序演示
        for (int i = 0; i < girlsList.size() - 1; i++) {
            for (int j = 0; j < girlsList.size() - i - 1; j++) {
                if (girlsList.get(j).getAge() > girlsList.get(j + 1).getAge()) {//若前面的元素大于后面的元素,依次比较，把最大的移动到最后。
                    GirlFriends glTemp = girlsList.get(j);//位置互调
                    girlsList.set(j, girlsList.get(j + 1));
                    girlsList.set(j + 1, glTemp);
                }
            }
        }
        return girlsList;
    }
}
