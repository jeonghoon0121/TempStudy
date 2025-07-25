package com.good;

public class fish extends Animal{

    @Override
    public void cry() {
        //super.cry();
        System.out.println("물고기가 어흠어흠운다.");
    }

    @Override
    public void eat() {
        //super.eat();
        System.out.println("물고기가 냠냠먹는다.");
    }
    public void run(){
        System.out.println("물고기가 헤엄친다. ");
    }

}
