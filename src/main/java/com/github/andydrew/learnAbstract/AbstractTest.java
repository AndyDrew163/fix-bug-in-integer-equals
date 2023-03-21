package com.github.andydrew.learnAbstract;

public class AbstractTest {
    public static void main(String[] args) {
        //Person person = new Person();抽象方法不能实例化，可以有构造方法，为子类实现多态做桥梁。
        Person person1 = new Teachers("李四", 23);
        Person person2 = new Programmer("张三", 26);
        System.out.println(person1.getName() + "\n" + person1.getAge());
        person1.work();
        System.out.println(person2.getName() + "\n" + person2.getAge());
        person2.work();
    }
}
