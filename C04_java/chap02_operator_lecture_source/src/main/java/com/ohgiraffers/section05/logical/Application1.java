package com.ohgiraffers.section05.logical;

public class Application1
{
    public static void main(String[] args)
    {
        /*
        * 논리 연결 연산자
        *
        *
        *   &&, ||
        *   논리 연결 연산자
        *   논리 부정 연산자
        *
        * */

        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);

        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||true);
        System.out.println(false||false);

        System.out.println(!true);
        System.out.println(!false);

        int a=10;
        int b=20;
        int c=30;
        int d=40;

        System.out.println(a<b&&c<d);
        System.out.println(a>b&&c<d);
        System.out.println(a<b&&c>d);
        System.out.println(a>b&&c>d);

        System.out.println(a<b||c<d);
        System.out.println(a>b||c<d);
        System.out.println(a<b||c>d);
        System.out.println(a>b||c>d);
    }
}
