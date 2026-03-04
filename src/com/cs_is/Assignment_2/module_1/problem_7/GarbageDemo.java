package com.cs_is.Assignment_2.module_1.problem_7;

public class GarbageDemo {
    public void finalize() {
        System.out.println("Garbage collected object");
    }

    public static void main(String[] args) {
        GarbageDemo obj1 = new GarbageDemo();
        GarbageDemo obj2 = new GarbageDemo();

        obj1 = null;
        obj2 = null;

        // Request JVM to run Garbage Collector
        System.gc();
    }
}

