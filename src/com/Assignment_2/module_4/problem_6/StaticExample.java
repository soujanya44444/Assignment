package com.Assignment_2.module_4.problem_6;
class StaticDemo {
    // Static variable
    static int count = 0;

    // Constructor
    StaticDemo() {
        count++;
    }

    // Static method
    static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }
}

public class StaticExample {
    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        StaticDemo obj3 = new StaticDemo();

        // Calling static method using class name
        StaticDemo.displayCount();
    }
}

