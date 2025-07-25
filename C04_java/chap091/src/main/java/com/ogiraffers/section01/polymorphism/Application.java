package com.ogiraffers.section01.polymorphism;

public class Application {
    public static void main(String[] args) {
        System.out.println("animal 생성");
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println("rabbit 생성");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        System.out.println("tiger 생성");
        Tiger tiger =new Tiger();
        tiger.eat();
        tiger.cry();
        tiger.bite();
        tiger.run();

        Animal a1 = new Rabbit();
        Animal a2 = new Tiger();
        ((Rabbit)a1).jump();
       // ((Tiger)a1).bite();
//        Rabbit r = new Animal();
        if(a1 instanceof Rabbit){
            ((Rabbit)a1).jump();
        }

        //클래스의 업캐스팅과 다운캐스팅
        //클래스 형변환은 업캐스팅과 다운캐스팅으로 구분가능



    }
}
