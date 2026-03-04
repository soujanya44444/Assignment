package com.cs_is.module_1;

import java.util.*;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1=scanner.nextInt();
        System.out.print("Enter the second number: ");
        int n2=scanner.nextInt();
        System.out.print("Enter the third number: ");
        int n3=scanner.nextInt();
        int largest;
        if(n3>=n2&&n2>=n1){
            largest=n3;
        }
        else if(n2>=n1&&n1>=n3){
            largest=n2;
        }
        else{
            largest=n1;
        }
        System.out.println("Largest of three number is:"+ largest);
    }
}
