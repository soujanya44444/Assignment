package com.Assignment_2.module_4.problem_4;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Create StringBuilder object
        StringBuilder sb = new StringBuilder(str);

        // Reverse the string
        sb.reverse();

        // Print reversed string
        System.out.println("Reversed string: " + sb);

        sc.close();
    }
}
