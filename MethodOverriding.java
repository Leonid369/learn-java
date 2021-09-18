package com.sara;

class A{}

class B extends A{}

class Sup{
    public A display(){
        System.out.println("Super display");
        return new A();
    }
}

class SubClass extends Sup{
    @Override
    public B display(){
        System.out.println("Sub display");
        return new B();
    }
}

public class MethodOverriding {
}
