package com.sara;

abstract class Super1{
    public Super1(){
        System.out.println("Super constructor");
    }
    abstract public void meth1();
}

class Sub1 extends Super1{
    @Override
    public void meth1() {
        System.out.println("Child meth1 implementation");
    }
}

public class AbstractExample1 {
    public static void main(String[] args){
        Super1 sup = new Sub1();
        sup.meth1();
    }
}
