package com.github.andydrew.learnJson;

public class StudentBuilder {
    private String school;
    private String name;
    private int age;
    private char sex;

    private StudentBuilder() {
    }

    /*aStudent()是一个静态工厂方法：
    优点
    1、静态工厂方法有名称，相比于构造器，可以准确的描述这个方法的契约。
    2、静态工厂方法不用在每次调用时都创建一个新对象，这样可以一定程度的节省内存。
    3、可以返回原返回类型的任何子类型的对象,从而在选择返回对象的类时有更大的灵活性。
    4、返回的对象可以随着每次的调用而发生变化。
    5、 方法返回的对象所属的类，在编写包含该静态工厂方法的类时可以不存在。
    缺点
    1、类如果不含public 或protected 的构造方法，就不能被子类化。
    2、不容易被程序员发现它们的存在。
     */
    public static StudentBuilder aStudent() {
        return new StudentBuilder();
    }

    public StudentBuilder withSchool(String school) {
        this.school = school;
        return this;//返回对象为了在每次赋值完变量后，能再次调用下一个赋值方法
    }

    public StudentBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder withSex(char sex) {
        this.sex = sex;
        return this;
    }

    public Student build() {
        return new Student(school, name, age, sex);
    }
}
