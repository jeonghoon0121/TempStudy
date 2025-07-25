package com.ogiraffers.section03.interfaceimplements;
/*클래스에서 인터페이스를 상속 받을 때에는 implements키워드를 사용한다.*/
public class Product implements InterProduct{

    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonstatic오버라이딩한 메소드 호출");
    }

    @Override
    public void abstMethod() {
        System.out.println("InterProduct의 static메소드호출 ");
    }
    //static 메소드는 오버라이딩 할수없다.
//    @Override
//    public static void staticMethod(){}

    @Override
    public void defaultMethod() {
        InterProduct.super.defaultMethod();
    }
}
