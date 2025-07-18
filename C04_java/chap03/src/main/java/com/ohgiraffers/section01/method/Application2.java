package com.ohgiraffers.section01.method;

public class Application2
{
    public static void main(String[] args)
    {
        System.out.println("main시작");
        Application2 app2=new Application2();
        app2.methodA();
        app2.methodB();
        app2.methodC();
        System.out.println("main종료");
        
    }
    public void methodA()
    {
        System.out.println("methodA호출됨..");
        System.out.println("methodA종료됨..");
    }
    public void methodB()
    {
        System.out.println("methodB호출됨..");
        System.out.println("methodB종료됨..");
    }
    public void methodC()
    {
        System.out.println("methodC호출됨..");
        System.out.println("methodC종료됨..");
    }
}
