package com.github.andydrew.learnAbstract;

public class Teachers extends Person {
    public Teachers() {
    }

    public Teachers(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("我的工作就是教书");
    }
}
