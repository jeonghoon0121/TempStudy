package com.ohgiraffers.section05.logical;

import org.w3c.dom.ls.LSOutput;

public class Application2
{
    public static void main(String[] args)
    {
        /*
        * 논리연산자 && 11순위 || 순위
        * */
        int num1=55;
        System.out.println(num1>=1&&num1<=100);
        int num2=166;
        System.out.println(num2>=1&&num1<=100);

        char ch1='G';
        System.out.println(ch1);

        System.out.println(ch1>='A'&&ch1<='Z');

        char ch2='g';
        System.out.println(ch2>='A'&&ch2<='Z');

        char ch3='Y';   //대문자 y
        System.out.println(ch3=='y'||ch3=='Y');

        //영문자인지 확인

        char ch5='f';

        System.out.println((ch5>=65)&&(ch5<=90)||(ch5>=97)&&(ch5<=122));

        if((ch5>=65)&&(ch5<=122))
        {
            System.out.println("영문자");
        }
        if((ch5>=65)&&(ch5<=96))
        {
            System.out.println("소문자");
        }
        if((ch5>=97)&&(ch5<=122))
        {
            System.out.println("대문자");
        }

        int i;

        for(i = 32; i <= 123; i++) {
            System.out.println((char)(i));
        }


    }
}
