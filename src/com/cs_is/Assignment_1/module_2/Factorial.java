package com.cs_is.module_2;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=scanner.nextInt();
        System.out.println("Factorial is: "+factorial(n));
    }
}
