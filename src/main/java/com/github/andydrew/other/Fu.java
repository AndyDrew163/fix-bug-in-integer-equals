package com.github.andydrew.other;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Fu {
    public static void main(String[] args) {
        String str = "abcdadbcdddddccaabbbeeeeaaadeeeccc";
        char[] characters = str.toCharArray();
        TreeMap<Character, Integer> treeMap = new TreeMap<>((newKey, oldKey) -> newKey - oldKey);
        for (int i = 0; i < characters.length; i++) {
            if (treeMap.containsKey(characters[i])) {
                treeMap.put(characters[i], treeMap.get(characters[i]) + 1);
            } else {
                treeMap.put(characters[i], 0);
            }
        }
        treeMap.forEach((key, values) -> System.out.print(key + "(" + values + ")"));
    }
}
