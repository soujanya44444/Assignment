package com.cs_is.module_1;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the student's marks between 0 to 100: ");
        int marks=scanner.nextInt();
        switch (marks/10){
            case 10,9:  System.out.println("Grade 'A'");
                break;
            case 8:  System.out.println("Grade 'B'");
                break;
            case 7,6:  System.out.println("Grade 'C'");
                break;
            case 5:  System.out.println("Grade 'D'");
                break;
            default:  System.out.println("Grade 'F'");
                break;
        }
    }
}
