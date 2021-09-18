package com.sara;

class TV{
    public void changeChannel(){
        System.out.println("TV channel is changed.");
    }

    public void switchOn(){
        System.out.println("TV is being switched on.");
    }
}

class SmartTv extends TV{

    @Override
    public void changeChannel(){
        System.out.println("Smart TV channel is changed.");
    }

    @Override
    public void switchOn(){
        System.out.println("Smart TV is being switched on.");
    }

    public void browse(){
        System.out.println("Smart TV browsing.");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args){
        TV t = new SmartTv();
        t.changeChannel();
        t.switchOn();

    }
}
