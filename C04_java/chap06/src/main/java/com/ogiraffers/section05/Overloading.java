package com.ogiraffers.section05;

public class Overloading {
    public void test(){

    }
//    public void test(){
//
//    }

//    public int test(){return 0;}
    //반환형은 시그니쳐가 아님
//
//    private void test(){}접근 제한자

    public void test(int num){}
//    public void test (int num2){} 매개 변수 이름은 메소드 시그니쳐에 영향을 주지 않음
    public void test(int num1, int num2){}
    //매개변수 개수에 따른 오버로딩 성립가능
    //매개변수 타입변화에 따른 오버로딩 성립확인
    public void test(int num2, String num1){}
    public void test(String num1,int num2){}
}
