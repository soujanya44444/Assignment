package com.Assignment_2.module_5.problem_4;
public class AgeExceptionDemo {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied. Age must be 18 or above.");
        } else {
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) {
        int age = 16;

        try {
            checkAge(age);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
