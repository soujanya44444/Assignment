package com.cs_is.module_2;

public class Student {
    String name;
    String usn;
    Student(){
        System.out.println("This is a default constructor");
    }
    Student(String name,String usn) {
        this.name=name;
        this.usn=usn;
        System.out.println("This is parameterized constructor");
    }
    void display(){
        System.out.print("Name: "+name+"\n");
        System.out.print("USN: "+usn);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.display();
        Student s2=new Student("sou","1SG23CS106");
        s2.display();
    }
}
