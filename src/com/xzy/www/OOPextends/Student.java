package com.xzy.www.OOPextends;

public class Student extends Person {
    String grade;
    public void study(){
        System.out.println(getName()+"正在"+getGrade()+"学习。");
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public Student(String grade) {
        this.grade = grade;
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
    }
}
