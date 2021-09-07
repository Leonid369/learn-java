package com.sara;

class Cylinder{
    public double radius;
    public double height;

    public double lidArea(){
        return Math.PI*radius*radius;
    }

    public double totalSurfaceArea(){
        return 2*Math.PI*radius*height + 2*lidArea();
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }

}

public class CylinderTest {
    public static void main(String[] args){
        Cylinder c = new Cylinder();
        c.height = 10;
        c.radius = 7;
        System.out.printf("Lid Area of the cylinder is %.2f \n", c.lidArea());
        System.out.printf("Total Surface area of the cylinder is %.2f \n", c.totalSurfaceArea());
        System.out.printf("Volume of the cylinder is %.2f \n", c.volume());
    }
}
