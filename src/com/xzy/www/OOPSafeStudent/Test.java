package com.xzy.www.OOPSafeStudent;

public class Test {
    public static void main(String[] args) {
        Student student=new Student("xzy",18,183,60);
        student.setAge(18);
        student.setName("xzy");
        student.setHeight(183);
        student.setWeight(60);

        //刚进校
        System.out.println("刚进学校");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getHeight());
        System.out.println(student.getWeight());
        student.study();
        //大二
        System.out.println("大二");
        System.out.println(student.getName());
        student.setAge(student.getAge()+1);
        System.out.println(student.getAge());
        student.setWeight(student.getWeight()+10);
        System.out.println(student.getHeight());
        System.out.println(student.getWeight());

        //大三
        System.out.println("大三");
        System.out.println(student.getName());
        student.setAge(student.getAge()+1);
        System.out.println(student.getAge());
        student.setHeight(student.getHeight()+2);
        System.out.println(student.getHeight());
        student.setWeight(student.getWeight()-3);
        System.out.println(student.getWeight());
        //大四
        System.out.println("大四");
        System.out.println(student.getName());
        student.setAge(student.getAge()+1);
        System.out.println(student.getAge());
        System.out.println(student.getHeight());
        System.out.println(student.getWeight());

        //毕业
        System.out.println("毕业");
        System.out.println(student.getName());
        student.setAge(student.getAge()+1);
        System.out.println(student.getAge());
        System.out.println(student.getHeight());
        System.out.println(student.getWeight());
    }
}
