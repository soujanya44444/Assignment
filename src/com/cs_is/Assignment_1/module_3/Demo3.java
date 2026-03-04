package com.cs_is.module_3;
// Method Overloading
class Printer {
    // Same method name, different parameters
    void display(String text) {
        System.out.println("Text: " + text);
    }
    void display(int number) {
        System.out.println("Number: " + number);
    }
}
// Method Overriding
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with key ignition");
    }
}
// Main Class
public class Demo3 {
    public static void main(String[] args) {
        // Method Overloading
        Printer p = new Printer();
        p.display("Hello");
        p.display(100);
        System.out.println();
        // Method Overriding
        Vehicle v = new Car();   // Parent reference
        v.start();               // Calls Car's method
    }
}