package com.cs_is.Assignment_2.module_2.problem_8;
class LifeCycleDemo extends Thread {

    public void run() {
        System.out.println("Thread is in RUNNING state");
        try {
            Thread.sleep(1000); // Thread goes to TIMED_WAITING
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread finished execution");
    }

    public static void main(String[] args) {
        LifeCycleDemo t1 = new LifeCycleDemo();

        System.out.println("State after creation: " + t1.getState());

        t1.start();
        System.out.println("State after start(): " + t1.getState());

        try {
            Thread.sleep(200);
            System.out.println("State during execution: " + t1.getState());

            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("State after completion: " + t1.getState());
    }
}