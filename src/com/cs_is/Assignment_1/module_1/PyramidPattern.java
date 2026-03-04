package com.cs_is.module_1;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the number of rows: ");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
