package com.xzy.www.OOPStaticStudentsTeacher;

public class Test {
    public static void main(String[] args) {
        Student student=new Student();
        //第一个学生
        student.name="小王";
        student.age=18;
        student.teacherName="王老师";
        student.StuTea();

        Student student1=new Student();
        //第二个学生
        student1.name="小李";
        student1.age=18;
        student1.teacherName="王老师";
        student1.StuTea();
        student.teacherName="李老师";
        student.StuTea();
        student1.StuTea();

    }
}
