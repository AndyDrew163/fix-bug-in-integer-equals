package com.github.andydrew.learn;

public class JsonTest {//当用final修饰一个类时，表明这个类不能被继承。注意final类中的所有成员方法都会被隐式地指定为final方法。
    private final int INT_MINAGE = 1;//对于一个final变量，如果是基本数据类型的变量，则其数值一旦在初始化之后便不能更改。
    private final String userName;//如果是引用类型的变量，则在对其初始化之后便不能再让其指向另一个对象。

    private JsonTest(String userName) {//当用final修饰一个方法时，该方法在子类中不能再被覆盖重写。
        this.userName = userName;//注：类的private方法会隐式地被指定为final方法。
    }

    public static JsonTest setUserName(String userName) {
        return new JsonTest(userName);
    }

    public static void main(String[] args) {
        Student student1 = StudentBuilder.aStudent()
                .withSchool("清华大fgghg学")
                .withName("色木空cbcbcb")
                .withAge(18)
                .withSex('男').build();
        Student student2 = StudentBuilder.aStudent()
                .withSchool("清华大学")
                .withName("色木空cbcbcb")
                .withAge(18)
                .withSex('男').build();
    }
}
