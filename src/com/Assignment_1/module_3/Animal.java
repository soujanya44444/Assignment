package com.Assignment_1.module_3;

public class Animal {
    void sound(){
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("BOW Bow");
    }
}
class demo{
    public static void main(String[] args) {
        Animal a1=new Dog();
        a1.sound();
    }
}
