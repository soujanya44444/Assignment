package com.cs_is.module_2;

public class MethodOverloading {
    public static int multiply(int a, int b){
        System.out.println("Result: "+a*b);
        return a*b;
    }
    public static int multiply(int a, int b,int c){
        System.out.println("Result: "+a*b*c);
        return a*b*c;
    }
    public static int multiply(int a, int b,int c,int d){
        System.out.println("Result: "+a*b*c*d);
        return a*b*c*d;
    }

    public static void main(String[] args) {
        multiply(1,2);
        multiply(1,2,3);
        multiply(1,2,3,4);

    }
}
