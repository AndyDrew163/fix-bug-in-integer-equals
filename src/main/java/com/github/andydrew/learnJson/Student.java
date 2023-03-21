package com.github.andydrew.learnJson;

import com.alibaba.fastjson.JSON;

public class Student {
    private String school;
    private String name;
    private int age;
    private char sex;

    public Student(String school, String name, int age, char sex) {
        this.school = school;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getSchool() {
        return school;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }
/*
 == 的作用：
　　基本类型：比较的就是值是否相同
　　引用类型：比较的就是地址值是否相同


equals 的作用:
　　引用类型：默认情况下，比较的是地址值。
注：不过，我们可以根据情况重写该方法。一般重写都是自动生成，比较对象的成员变量值是否相同

JAVA中所有的类都是继承于Object这个超类的，在Object类中定义了一个equals的方法，而equals的源码如下：
  public boolean equals(Object obj) {
        return (this == obj);
    }
 可以看到，这个方法的初始默认行为是比较对象的内存地址值。
 在String、Integer、Date这些类当中equals方法都被重写（一般都是用来比较对象的成员变量值是否相同），而不再是比较类在堆内存中的存放地址。
总结：在没有覆写equals方法的情况下，引用数据类型之间的比较还是内存中的存放位置的地址值，跟双等号（==）的结果相同；如果被复写，那按照复写的要求来。
 */
    @Override/*方法重写（方法覆盖）的前提是发生在具有继承关系的两个类之间，方法重写有以下规则：
              参数列表，返回值，方法名必须保持一致
              子类可以继承父类中的静态方法，但是不能重写父类中的静态方法。也就是静态方法不具备多态
              子类中重写后方法的访问修饰符 不能小于 父类方法的访问修饰符（public > protected > default > private）
              重写方法的访问权限范围必须大于等于父类方法
              重写方法的抛出异常类型范围不能大于父类方法*/
    public boolean equals(Object anObject) {
        if (this == anObject) {//代表两个Object是指向同一个地址
            return true;
        }
        if (anObject instanceof Student) {//代表anObject是Student的一个实例对象
            String strJson1 = JSON.toJSONString(this);
            String strJson2 = JSON.toJSONString(anObject);
            char[] charsJson1 = strJson1.toCharArray();
            char[] charsJson2 = strJson2.toCharArray();
            if (charsJson1.length == charsJson2.length) {
                for (int i = 0; i < charsJson1.length; i++) {
                    if (charsJson1[i] != charsJson2[i]) {
                        return false;//return的功能是结束一个方法并返回该方法的返回值。
                    }//一旦在循环体内执行到一个return语句，return语句将立刻结束该方法，循环自然也随之结束。
                }
                return true;
            }
            return false;
        }
        return false;
    }
}
