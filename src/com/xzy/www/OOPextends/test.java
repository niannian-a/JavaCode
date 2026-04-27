package com.xzy.www.OOPextends;

public class test {
    public static void main(String[] args) {
        Student student=new Student("小王",20,"三年级");
        Teacher teacher=new Teacher("王老师",20,"语文");
        teacher.teaching();
        student.study();
    }
}
