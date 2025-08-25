package com.org.thread;

public class Application {
    public static void main(String[] args) {
        Thread car= new Car();
        Thread tank=new Tank();
        Thread plain=new Thread(new Plain());
//        car.run();
//        tank.run();
//        plain.run();
        car.start();
        tank.start();
        plain.start();

    }
}
