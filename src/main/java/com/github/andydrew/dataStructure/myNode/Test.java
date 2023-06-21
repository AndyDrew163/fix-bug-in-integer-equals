package com.github.andydrew.dataStructure.myNode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        MyNodeList<String> myNodeList = new MyNodeList<>();
        myNodeList.add("aaaa");
        myNodeList.add("bbbb");
        myNodeList.add("cccc");
        myNodeList.add("dddd");
        myNodeList.add("eeee");
        Object[] objects = myNodeList.toArray();
        System.out.println(myNodeList.getSize());
        for (Object str : objects
        ) {
            System.out.println(str);
        }
        MyNodeList<String> myNodeList1 = new MyNodeList<>();
        myNodeList1.addMyNode("AAAA");
        myNodeList1.addMyNode("BBBB");
        myNodeList1.addMyNode("CCCC");
        myNodeList1.addMyNode("DDDD");
        myNodeList1.addMyNode("EEEE");
        Object[] objects1 = myNodeList1.toArrayMyNode();
        System.out.println(myNodeList1.getSize());
        for (Object str : objects1
        ) {
            System.out.println(str);
        }
       myNodeList1.getItr().printSize();
    }
}
