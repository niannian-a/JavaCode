package com.xzy.www.ArrayListStudent;
import java.util.ArrayList;

public class StudentArrayList {
    public static void main(String[] args) {
        Student stu1=new Student(1,"张三",18);
        Student stu2=new Student(2,"李四",19);
        Student stu3=new Student(3,"王五",20);
        ArrayList<Student> studentArrayList=new ArrayList<>();
        studentArrayList.add(stu1);
        studentArrayList.add(stu2);
        studentArrayList.add(stu3);
        int index=findById(studentArrayList,3);
        System.out.println(index);
        System.out.println(studentArrayList.get(index).name);

        for (int i = 0; i < 3; i++) {
            System.out.println("第"+(i+1)+"位学生");
            System.out.println("学生id："+studentArrayList.get(i).id+
                                "学生姓名："+studentArrayList.get(i).name+
                                "学生年龄"+studentArrayList.get(i).age);
        }
    }

    public static int findById(ArrayList<Student> studentArrayList,int id){
        for (int i = 0; i < 3; i++) {
            Student stu = studentArrayList.get(i);
            if(i==2){
                if((stu.getId())==id){
                    return i;
                }else
                    return -1;
            }else {
                if((stu.getId())==id){
                    return i;
                }
            }
        }
        return -1;
    }
}
