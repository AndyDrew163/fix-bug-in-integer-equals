package com.github.andydrew.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.BiConsumer;

public class VotingMachine {
    public static void main(String[] args) {
        Character[] characters = {'A', 'B', 'C', 'D'};
        ArrayList<Character> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(4);
            arrayList.add(characters[index]);
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (Character a : arrayList) {
            if (hashMap.containsKey(a)) {
                int count = hashMap.get(a) + 1;
                hashMap.put(a, count);
            } else {
                hashMap.put(a, 1);
            }
        }
        int max = 0;
        Character maxChar = '0';
        for (Map.Entry<Character, Integer> e : hashMap.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                maxChar = e.getKey();
            }
        }
        hashMap.forEach((key, values) -> System.out.println(key + ": " + values));
        System.out.println(maxChar + ": " + max);
    }
}
