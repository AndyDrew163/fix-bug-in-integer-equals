package com.github.andydrew.other;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int chineseGrades;
    private int mathGrades;
    private int englishGrades;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, int chineseGrades, int mathGrades, int englishGrades) {
        this.name = name;
        this.age = age;
        this.chineseGrades = chineseGrades;
        this.mathGrades = mathGrades;
        this.englishGrades = englishGrades;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return chineseGrades
     */
    public int getChineseGrades() {
        return chineseGrades;
    }

    /**
     * 设置
     *
     * @param chineseGrades
     */
    public void setChineseGrades(int chineseGrades) {
        this.chineseGrades = chineseGrades;
    }

    /**
     * 获取
     *
     * @return mathGrades
     */
    public int getMathGrades() {
        return mathGrades;
    }

    /**
     * 设置
     *
     * @param mathGrades
     */
    public void setMathGrades(int mathGrades) {
        this.mathGrades = mathGrades;
    }

    /**
     * 获取
     *
     * @return englishGrades
     */
    public int getEnglishGrades() {
        return englishGrades;
    }

    /**
     * 设置
     *
     * @param englishGrades
     */
    public void setEnglishGrades(int englishGrades) {
        this.englishGrades = englishGrades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", chineseGrades = " + chineseGrades + ", mathGrades = " + mathGrades + ", englishGrades = " + englishGrades + "}";
    }
}
