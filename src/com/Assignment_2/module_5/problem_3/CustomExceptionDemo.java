package com.Assignment_2.module_5.problem_3;
// Custom Exception Class
class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    // Method using throws
    static void checkNumber(int num) throws MyException {
        if (num < 0) {
            // Using throw to create exception
            throw new MyException("Number cannot be negative");
        } else {
            System.out.println("Number is valid: " + num);
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (MyException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }
}