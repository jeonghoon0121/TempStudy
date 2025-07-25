package com.ogiraffers.section02.abstractclass;

public class Application {
    public static void main(String[] args) {
        SmartPhone smartPhone =new SmartPhone();

        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof Product);
        Product product = new SmartPhone();

        product.abstMethod();
    }

}
