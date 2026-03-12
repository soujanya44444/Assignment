package com.Assignment_2.module_5.problem_1;
import java.io.*;

public class ExceptionDemo {

    // Method for Checked Exception
    static void checkedExample() throws IOException {
        FileReader file = new FileReader("test.txt"); // may cause FileNotFoundException
        BufferedReader br = new BufferedReader(file);
        System.out.println(br.readLine());
        br.close();
    }

    public static void main(String[] args) {

        // Unchecked Exception Example
        try {
            int a = 10, b = 0;
            int result = a / b; // ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: " + e);
        }

        // Checked Exception Example
        try {
            checkedExample();
        } catch (IOException e) {
            System.out.println("Checked Exception: " + e);
        }
    }
}
