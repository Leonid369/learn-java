package com.sara;

public class CylinderImprvd {
    private double radius;
    private double height;

    public CylinderImprvd(){
        setRadius(1);
        setHeight(1);
    }

    public CylinderImprvd(double r, double h){
        setRadius(r);
        setHeight(h);
    }

    public double getRadius(){
        return radius;
    }

    public double getHeight(){
        return height;
    }

    public void setRadius(double r){
        if( r > 0)
            radius = r;
        else
            radius = 0;
    }

    public void setHeight(double h){
        if( h > 0)
            height = h;
        else
            height = 0;
    }

    public static void main(String[] args){

        CylinderImprvd c = new CylinderImprvd(10, -20);
        System.out.println("Height of the cylinder is " + c.getHeight());
        System.out.println("Radius of the cylinder is " + c.getRadius());
    }
}
