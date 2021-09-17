package com.sara;

class Parent{
    Parent(){
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("Child Constructor");
    }
}

class GrandChild extends Child{
    GrandChild(){
        System.out.println("Grandchild constructor");
    }
}

public class InheritanceConst {
    public static void main(String[] args){
        GrandChild c = new GrandChild();
    }
}
