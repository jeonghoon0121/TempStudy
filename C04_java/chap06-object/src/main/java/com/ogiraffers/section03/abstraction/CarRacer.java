package com.ogiraffers.section03.abstraction;

public class CarRacer {
    private final Car car= new Car();
    //1대의 차만 운전가능

    public void startUp(){
        car.startUp();
    }
    public void stepAccelator(){
        car.go();
    }
    public void stepBreak(){
        car.stop();
    }
    public void turnOff(){
        car.turnOff();
    }

}
