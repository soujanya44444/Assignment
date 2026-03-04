package com.cs_is.Assignment_2.module_1.Problem_1;

abstract class Shape {
    abstract double area();
}
class Circle extends Shape{
    private double radius;
    public  Circle(double radius){
        this.radius=radius;
    }
    @Override
    double area(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    @Override
    double area(){
        return length*width;
    }
}
class Main{
    public static void main(String[] args) {
        Shape circle=new Circle(5);
        Shape rectangle=new Rectangle(4,6);
        System.out.println("Circle Area: "+circle.area());
        System.out.println("Rectangle area: "+rectangle.area());
    }
}
