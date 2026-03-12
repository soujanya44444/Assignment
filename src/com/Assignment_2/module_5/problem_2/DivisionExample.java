package com.Assignment_2.module_5.problem_2;
public class DivisionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b; // Division by zero
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        finally {
            System.out.println("Finally block executed.");
        }
    }
}

