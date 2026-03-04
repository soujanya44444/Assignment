package com.cs_is.module_3;

public class Shape {
    int radius=5;
     void area(){
        System.out.println("Area of the shape");
    }
}
class Circle extends Shape{
    @Override
    void area(){
        System.out.print("Area of circle is: "+3.14*radius*radius);
        System.out.println();
    }
}
class Rectangle extends Shape{
    @Override
    void area(){
        double length=3;
        double width=6;
        System.out.print("Area of Rectangle is: "+length*width);
    }
}
class Demo2{
    public static void main(String[] args) {
        Shape s1=new Circle();
        s1.area();
        Shape s2=new Rectangle();
        s2.area();
    }
}