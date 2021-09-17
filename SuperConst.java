package com.sara;

import java.sql.SQLOutput;

class Rectangles{
    int length;
    int breadth;

    Rectangles(){
        length = breadth = 1;
    }

    Rectangles(int l, int b){
        length = l;
        breadth = b;
    }

    int area(){
        return length*breadth;
    }
}

class Cuboid extends Rectangles{
    int height;

    Cuboid(){
        height = 1;
    }

    Cuboid(int h){
        height = h;
    }

    Cuboid(int l, int b, int h){
        super(l,b);
        height = h;
    }

    int volume(){
        return length * breadth * height;
    }
}

public class SuperConst {
    public static void main(String[] args){
        Cuboid c = new Cuboid(5, 3, 10);
        System.out.println("Volume: " + c.volume());
    }

}
