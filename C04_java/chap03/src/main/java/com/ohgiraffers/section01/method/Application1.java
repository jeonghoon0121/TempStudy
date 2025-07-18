package com.ohgiraffers.section01.method;

public class Application1
{
    public static void main(String[] args)
    {
        /*메소드 호출 흐름*/
        System.out.println("main 시작");
        Application1 app1= new Application1();  //객체생성
        app1.methodA(); //메소드

        System.out.println("main 종료");
    }
    public void methodA()
    {
        System.out.println("methodA 호출");
        methodB();
        System.out.println("methodA 종료");
    }
    public void methodB()
    {
        System.out.println("methodB 호출");
        methodC();
        System.out.println("methodB 종료");
    }
    public void methodC()
    {
        System.out.println("methodC 호출");
        System.out.println("methodC 종료");
    }
}
