package com.ohgiraffers.section01.method;

public class Application8
{
    public static void main(String[] args)
    {
        //static 호출
        Application8.sumTwoNum(10,20);
        System.out.println(Application8.sumTwoNum(10,20));
        
        //동일 클래스일경우 클래스명 생략가능
        System.out.println(sumTwoNum(10,20));
    }
    public static int sumTwoNum(int fir, int sec)
    {

        return fir+sec;
    }
}
