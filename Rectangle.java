package com.sara;


class Rectangle1{
    public double length;
    public double breadth;

    public double area(){
        return length*breadth;
    }

    public double perimeter(){
        return 2*(length+breadth);
    }

    public boolean isSquare(){
        return length*breadth == length*length;
    }
}

public class Rectangle {
    public static void main(String[] args){
        Rectangle1 r = new Rectangle1();
        r.length = 10;
        r.breadth = 10;

        System.out.println("Area of the rectangle is " + r.area());
        System.out.println("Perimeter of the rectangle is " + r.perimeter());
        if(r.isSquare())
            System.out.println("Is actually a square!");

    }

}
