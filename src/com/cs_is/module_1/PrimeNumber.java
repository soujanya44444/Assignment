package com.cs_is.module_1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("ENter the number: ");
        int n=scanner.nextInt();
        boolean isPrime=true;
        if(n<=1){
            isPrime=false;
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime) System.out.println("the number is prime");
        else System.out.println("the number is not prime");
    }
}
