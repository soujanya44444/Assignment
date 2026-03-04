package com.cs_is.module_1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= scanner.nextInt();
        int last=10;
        for(int i=1;i<=last;i++){
            int result=n*i;
            System.out.println(result);
        }
    }
}
