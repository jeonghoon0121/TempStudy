package com.ogiraffers.section02.abstractclass;

public abstract class Product {
    private int nonStaticField;
    private static int staticField;

    public Product(){}

    public void nonStaticMethod(){
        System.out.println("Product의 클래스의 nonStaticMethod호출함");
    }
    public static void staticMethod(){
        System.out.println("Product 클래스의 staticMethod호출함 ");
    }
    public abstract void abstMethod();
}
