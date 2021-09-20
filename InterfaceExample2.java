package com.sara;

class Phone{
    public void call() { System.out.println("Phone call"); }
    public void sms() { System.out.println("Phone sms"); }
}

interface ICamera {
    void click();
    void record();
}

interface IMusicPlayer {
    void play();
    void stop();
}

class Smartphone extends Phone implements ICamera, IMusicPlayer {
    public void videoCall() { System.out.println("Smartphone video calling"); }
    public void playGame() { System.out.println("Smartphone playing game"); }
    public void click() { System.out.println("Smartphone camera clicking photo"); }
    public void record() { System.out.println("Smartphone camera recording video"); }
    public void play() { System.out.println("Smartphone playing music"); }
    public void stop() { System.out.println("Smartphone stop music"); }
}

public class InterfaceExample2 {
    public static void main(String[] args){
        Smartphone s = new Smartphone();

        Phone p = s;
        p.call();
        p.sms();

        ICamera c = s;
        c.click();
        c.record();

        IMusicPlayer m = s;
        m.play();
        m.stop();
    }
}
