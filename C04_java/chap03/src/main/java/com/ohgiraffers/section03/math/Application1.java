package com.ohgiraffers.section03.math;

public class Application1
{
    public static void main(String[] args)
    {
        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html
        //운영체제가 프로그래밍 언어가 제공하는 기능을 제어가능
        //가져다 쓰자
        //API 응용프로그램에서 사용가능하도록 운영체제가 프로그래밍 언어가 제공하는 기능을 제어가능하도록
        //만든 인터페이스
        //java.sql
        //java.lang.Math

        //모든 메소드가 static메소드이다. 
        
        /*절대값출력
        *
        * 1.풀네임 다쓰기. 2임포트하기*/
        System.out.println((java.lang.Math.abs(-7)));
        System.out.println(Math.abs(-1.25));
        System.out.println(Math.min(10,20));
        System.out.println(Math.max(20,30));
        System.out.println(Math.PI);
        System.out.println(Math.random());//0~1까지의 난수

    }
}
