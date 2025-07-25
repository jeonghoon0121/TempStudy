package com.good;

public class Application {
    public static void main(String[] args) {
        Animal animal1=new Animal();
        animal1.cry();
        animal1.eat();
        animal1.run();
        Animal animal2=new fish();
        animal2.cry();
        animal2.run();
        animal2.eat();
        Animal A;
        A=(animal1);
        A.cry();

    }
}
