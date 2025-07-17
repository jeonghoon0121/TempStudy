package com.ohgiraffers.section01.method;

public class Application6 
{
    public static void main(String[] args) 
    {
    //메소드 리턴값
        Application6 app6=new Application6();
        app6.testMethod();

        String returnText=app6.testMethod();
        System.out.println("returntext"+returnText);
        System.out.println(app6.testMethod());
    }
    public String testMethod()
    {
    return("hello world");
    }
}
