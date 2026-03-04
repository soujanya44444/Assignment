package com.cs_is.module_2;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str){
        str=str.toLowerCase().replaceAll("\\s+","");
        String reversed=new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("ENter the String: ");
        String str=scanner.nextLine();
        System.out.println(isPalindrome(str));
    }
}
