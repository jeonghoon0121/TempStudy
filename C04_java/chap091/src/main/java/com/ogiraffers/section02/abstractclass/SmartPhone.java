package com.ogiraffers.section02.abstractclass;

public class SmartPhone extends Product{

    public SmartPhone(){}

    @Override
    public void abstMethod() {
        System.out.println("Product클래스의 absMethod오버라이딩한 메소드 호출함 ");
    }
    public void printSmartPhone(){
        System.out.println("");
    }
}
