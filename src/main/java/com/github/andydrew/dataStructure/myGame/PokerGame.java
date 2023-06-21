package com.github.andydrew.dataStructure.myGame;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class PokerGame {
    static HashMap<Integer, String> pokerMap = new HashMap<>();
    static ArrayList<Integer> serialList = new ArrayList<>();

    static {
//准备扑克牌
        String[] color = {"♦", "♣", "♥", "♠"};//扑克牌花色
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};//扑克牌数字
        int serialNumber = 0;
        for (String n : number) {
            for (String c : color) {
                pokerMap.put(serialNumber, c + n);
                serialList.add(serialNumber);
                serialNumber++;
            }
        }
        pokerMap.put(serialNumber, "大王");
        serialList.add(serialNumber);
        pokerMap.put(serialNumber + 1, "小王");
        serialList.add(serialNumber + 1);
    }

    public PokerGame() {
        //第一步：洗牌
        Collections.shuffle(serialList);
        //第二步：发牌 TreeSet排序扑克牌
        TreeSet<Integer> landowner = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        for (int i = 0; i < serialList.size(); i++) {
            int serialNumber = serialList.get(i);
            if (i <= 2) {
                landowner.add(serialNumber);
                continue;
            }
            if (i % 3 == 0) player1.add(serialNumber);
            else if (i % 3 == 1) player2.add(serialNumber);
            else player3.add(serialNumber);
        }
        lookPoker("andy", player1);
        lookPoker("andy", player2);
        lookPoker("andy", player3);
    }

    public void lookPoker(String name, TreeSet<Integer> player) {
        Iterator<Integer> iterator = player.iterator();
        while (iterator.hasNext()) {
            int key = iterator.next();
            System.out.print(pokerMap.get(key));
        }
        System.out.println("");
    }
}
