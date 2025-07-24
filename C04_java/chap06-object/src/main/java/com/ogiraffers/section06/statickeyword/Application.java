package com.ogiraffers.section06.statickeyword;

public class Application {
    public static void main(String[] args) {
    StaticFieldTest sft1=new StaticFieldTest();

        System.out.println(sft1.getNonStaticCount());
        System.out.println(sft1.getStaticCount());

        sft1.increaseNonstaticCount();
        sft1.increaseStaticCount();

        System.out.println(sft1.getNonStaticCount());
        System.out.println(sft1.getStaticCount());

        StaticFieldTest sft2=new StaticFieldTest();

        System.out.println(sft2.getNonStaticCount());
        System.out.println(sft2.getStaticCount());

        //인스턴스 변수의 경우 sft1과 sft2두개의 인스턴스가 서로 값을 공유못하고
        //인스턴스를 생성할때마다 0으로 초기화 
        //하지만 static 필드의 경우 클래스 변수 자체가 프로그램을 종료할 때까지 유지되고있기에 값을 유지
        //따라서 여러개의 인스턴스가 같은 공간을 공유할 목적으로 필드에 static키워드를 사용한다.

        StaticMethodTest smt1=new StaticMethodTest();
        smt1.nonStaticMethod();


        StaticMethodTest.staticMethod(); //권장
    }
}
