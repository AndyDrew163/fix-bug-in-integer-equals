package com.github.andydrew.keyGenMe;

public class GirlFriends {
    private String name;
    private int age;
    private int height;

    public GirlFriends() {
    }

    public GirlFriends(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "女朋友名字：" + this.name + "，" + this.age + "岁，身高：" + this.height + "cm!";
    }
}
