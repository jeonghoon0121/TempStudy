package com.ohgiraffers.section01.method;

public class Application7
{
    //스태틱메모리를 쓸때는 싱글톤 객체를 만들 때 쓰자 , 같은 메소드르 다같이 쓸때
    public static void main(String[] args)
    {
        int num1, num2;
        num1 = 20; num2=10;
        System.out.println("start");
        Application7 app71= new Application7();
        System.out.println(app71.plus2n(num1,num2));
        System.out.println(app71.minus2n(num1,num2));
        System.out.println(app71.multi2n(num1,num2));
        System.out.println(app71.div2n(num1,num2));
        System.out.println("end");
    }
    public int plus2n(int first, int second)
    {
        return first+second;
    }
    public int minus2n(int first, int second)
    {
        return first-second;

    }
    public int multi2n(int first, int second)
    {
        return first*second;

    }
    public int div2n(int first, int second)
    {
        return first/second;

    }
}
