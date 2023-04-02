package com.github.andydrew.learnAbstract;

public class Programmer extends Person {

    public Programmer() {
    }

    public Programmer(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("我的工作时写程序");
    }
}
