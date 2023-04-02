package com.github.andydrew.learnAbstract;

public abstract class Person {//抽象类中抽象方法可有可无。
    private String name;
    private int age;

    private String userName = "andydrew";

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void work();//只有抽象类才能有抽象方法
}
