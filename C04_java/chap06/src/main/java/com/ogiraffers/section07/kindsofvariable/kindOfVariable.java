package com.ogiraffers.section07.kindsofvariable;

public class kindOfVariable {
    //필드 클래스영역에 장석하는 변수
    //멤버변수, 전역변수 ,인스턴스 변수(생성시점에서 사용가능
    private int globalNum;
    //정적필드, 클래스변수,
    private static int staticNum;
    //nonstatic필드 인슽턴스변수, 멤버변수,
    //static필드 클래스변수, 정적변수

    public void testMethod(int num){
        //지역변수, 메소드영역
        //매개변수도 지역변수 -< 스택메모리영역할당
        int localNum;
//        System.out.println(localNum); 초기화하지않으면 사용불가능
    }
    public void testMethod2(){

    }

}
