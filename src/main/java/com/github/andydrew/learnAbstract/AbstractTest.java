package com.github.andydrew.learnAbstract;

import java.util.ArrayList;

public class AbstractTest {
    public static void main(String[] args) {
        //Person person = new Person();抽象方法不能实例化，可以有构造方法，为子类实现多态做桥梁。
        Person person1=new Programmer();
        Person person2=new Teachers();//1、继承关系的存在
        person1.work();//2、父类引用变量指向子类对象
        person2.work();//3、父类方法被子类重写
    }
}