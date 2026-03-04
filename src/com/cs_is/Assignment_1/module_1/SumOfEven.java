package com.cs_is.module_1;

import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=scanner.nextInt();
        while(n<=100){
            if(n%2==0){
                System.out.println("THe number is even");
                break;
            }
            else{
                System.out.println("THe number is odd");
            }n++;
        }
    }
}
