package com.cs_is.Assignment_2.module_2.problem_5;
// Thread using Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread created using Thread class");
    }
}

// Thread using Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread created using Runnable interface");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        MyRunnable r1 = new MyRunnable();
        Thread t2 = new Thread(r1);
        t2.start();
    }
}