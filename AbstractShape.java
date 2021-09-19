package com.sara;

abstract class Shape{
    abstract public double perimeter();
    abstract public double area();
}

class Rect extends Shape{
    double length;
    double breadth;

    Rect(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double perimeter(){
        return 2*(length + breadth);
    }

    public double area(){
        return length*breadth;
    }
}

class Square extends Shape{
    double side;

    public double perimeter(){
        return 4*side;
    }

    public double area(){
        return side*side;
    }
}


public class AbstractShape {

    public static void main(String[] args){
        Shape s = new Rect(10, 15);
        System.out.println("Area: " + s.area());
    }
}
