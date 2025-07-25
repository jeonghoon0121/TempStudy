package com.ogiraffers.section03.interfaceimplements;

public interface InterProduct {
    public static final int MAX_NUM =100;
    //인터페이스는 상수필드만 작성이 간믕
    //반드시 선언과 동시에 초기화 해줘야됨

    int MIN_NUM=10;
    //상수로 바뀐다.//생성자를 못가진다.

    public abstract void nonStaticMethod();
    void abstMethod();
    //다른 접근제한자 사용불가

    //public으로 해야 오버라이딩이 가능
    //static메소드가 사용가능함 
    public static void staticMethod(){
        System.out.println("staticmethod호출됨");
    }
    //default non-static메소드도 작성이 가능하다.
    public default void defaultMethod(){
        System.out.println();
    }
}

