package com.Assignment_2.module_4.problem_5;

class Parent {
    // Final method
    final void show() {
        System.out.println("This is a final method in Parent class.");
    }
}

// Final class
final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

public class FinalDemo {
    public static void main(String[] args) {

        // Final variable
        final int number = 100;
        System.out.println("Final variable value: " + number);

        Parent obj1 = new Parent();
        obj1.show();

        FinalClass obj2 = new FinalClass();
        obj2.display();
    }
}

