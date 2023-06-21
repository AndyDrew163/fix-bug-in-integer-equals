package com.github.andydrew.other;

import java.util.*;

public class TreeSetTest {
    static TreeSet<Student> students;

    static {
        Student student1 = new Student("zdfa", 12, 67, 68, 97);
        Student student2 = new Student("bdcws", 14, 87, 96, 67);
        Student student3 = new Student("adswe", 12, 57, 46, 37);
        Student student4 = new Student("efedss", 11, 77, 76, 57);
        Student student6 = new Student("zedwa", 13, 37, 86, 87);
        Student student7 = new Student("zdwa", 13, 37, 86, 87);
        students = new TreeSet<>((o1, o2) -> {
            int sum1 = o1.getChineseGrades() + o1.getMathGrades() + o1.getEnglishGrades();
            int sum2 = o2.getChineseGrades() + o2.getMathGrades() + o2.getEnglishGrades();
            int difference = sum2 - sum1 == 0 ? o2.getChineseGrades() - o1.getChineseGrades() : sum2 - sum1;
            difference = difference == 0 ? o2.getMathGrades() - o1.getMathGrades() : difference;
            difference = difference == 0 ? o2.getEnglishGrades() - o1.getEnglishGrades() : difference;
            difference = difference == 0 ? o2.getAge() - o1.getAge() : difference;
            difference = difference == 0 ? o2.getName().compareTo(o1.getName()) : difference;
            return difference;
        });
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student4);
        students.add(student6);
        students.add(student7);
    }

    public static void main(String[] args) {
        //students.forEach(student -> System.out.println(student + " 总分：" + (student.getChineseGrades() + student.getMathGrades() + student.getEnglishGrades())));
//        Iterator<Student> iterator = students.iterator();
//        while (iterator.hasNext()) {
//            Student student = iterator.next();
//            System.out.println(student);
//        }
        Map<String, String> m = new HashMap<>();
        m.put("杨过", "小龙女");
        m.put("郭靖", "黄蓉");
        m.put("张无忌", "赵敏");
        m.put("令狐冲", "任盈盈");
        m.putIfAbsent("令狐冲", "小师妹");//如果键重复，则不添加不覆盖
        Set<String> keys = m.keySet();
        keys.forEach(o -> System.out.println(o + "的老婆是：" + m.get(o)));
//        Set<Map.Entry<String, String>> entries = m.entrySet();
//        entries.forEach(o -> System.out.println(o.getKey() + "的老婆是：" + o.getValue()));
//        Student student1 = new Student("张无忌", 23);
//        Student student2 = new Student("令狐冲", 23);
//        Student student3 = new Student("薛仁贵", 23);
//        Student student=student1;
//        Map<Student, String> stuMap = new HashMap<>();
//        stuMap.put(student1, "湖南");
//        stuMap.put(student2, "江西");
//        stuMap.put(student3, "湖北");
//        stuMap.put(student3, "云南");
//        for (Map.Entry<Student, String> entry : stuMap.entrySet()
//        ) {
//            System.out.println("姓名：" + entry.getKey().getName() + " 年龄：" + entry.getValue());
//        }
//        for (int i = 0; i < 129; i++) {
//            System.out.println(i+": "+Integer.toBinaryString(i));
//        }
        TreeSet<Integer> ts = new TreeSet<>((o1, o2) -> o1 - o2);
        ts.add(23);
        ts.add(233);
        ts.add(22);
        ts.add(144);
        System.out.println(ts);
    }
}