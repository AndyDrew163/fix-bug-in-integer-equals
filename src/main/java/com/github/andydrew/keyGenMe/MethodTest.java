package com.github.andydrew.keyGenMe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MethodTest {
    static ArrayList<GirlFriends> girlFriends = new ArrayList<>();

    static GirlFriends[] girls = new GirlFriends[9];

    static {
        GirlFriends girls1 = new GirlFriends("Ada", 18, 165);
        GirlFriends girls2 = new GirlFriends("Badia", 22, 160);
        GirlFriends girls3 = new GirlFriends("Cady", 19, 159);
        GirlFriends girls4 = new GirlFriends("Dagny", 19, 161);
        GirlFriends girls5 = new GirlFriends("Acho", 19, 161);
        GirlFriends girls6 = new GirlFriends("Dagny", 19, 155);
        GirlFriends girls7 = new GirlFriends("Cici", 25, 149);
        GirlFriends girls8 = new GirlFriends("Gay", 14, 164);
        GirlFriends girls9 = new GirlFriends("Finoa", 23, 167);
        girlFriends.add(girls1);
        girlFriends.add(girls2);
        girlFriends.add(girls3);
        girlFriends.add(girls4);
        girlFriends.add(girls5);
        girlFriends.add(girls6);
        girlFriends.add(girls7);
        girlFriends.add(girls8);
        girlFriends.add(girls9);
    }

    static {
        for (int i = 0; i < 9; i++) {
            girls[i] = girlFriends.get(i);
        }
    }

    public static void main(String[] args) {
//        FindSorts.girlsBubbleSort(girlFriends);
//        for (GirlFriends gf : girlFriends) {
//            System.out.println(gf.toString());
//        }
        //因Comparator是一个函数式接口（该接口只有一个抽象方法，简称函数式接口），所以可以用lambda表达式来写
//        Arrays.sort(girls, (GirlFriends o1, GirlFriends o2) -> o1.getAge() - o2.getAge());
//        System.out.println(Arrays.toString(girls));
        Arrays.sort(girls, (GirlFriends o1, GirlFriends o2) -> {//lambda表达式来重写接口Comparator中的方法
            int temp = o1.getAge() - o2.getAge();
            temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
            temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
            return temp;
        });
        for (GirlFriends gl : girls) {
            System.out.println(gl);
        }
    }
}
