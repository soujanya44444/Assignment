package com.cs_is.module_1;
import java.util.*;
public class PositiveOrNegativeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the number:");
        int n=scanner.nextInt();
        if(n>0){
            System.out.println("The number is positive");
        }
        else if(n<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");
        }
    }
}
