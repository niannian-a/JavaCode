package com.xzy.www.OOPextends;

public class Teacher extends Person {
    String subject;

    public void teaching(){
        System.out.println(getName()+"在教"+getSubject()+"。");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public Teacher(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher() {
    }
}
