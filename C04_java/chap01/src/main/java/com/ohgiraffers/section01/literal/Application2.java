package com.ohgiraffers.section01.literal;

import java.sql.SQLOutput;

public class Application2
{
    public static void main(String[] args)
    {
        //comment 값을 연산하여 출력가능
        //ctrl + d
        //alt + shift +  방향키

        //정수
        System.out.println(123+456);
        System.out.println(123-456);
        System.out.println(123*456);
        System.out.println(123/456);
        System.out.println(123%456);
        //실수
        System.out.println(1.23+1.23);
        System.out.println(1.23-1.23);
        System.out.println(1.23*1.23);
        System.out.println(1.23/1.23);
        System.out.println(1.23%1.0);   //오차가 있음
        //실수 +정수
        System.out.println(123+0.5);
        System.out.println(123-0.5);
        System.out.println(123*0.5);
        System.out.println(123/0.5);
        System.out.println(123%0.5);
        System.out.println("-----");
        //문자와 문자 연산
        System.out.println('a'+'b');
        System.out.println('a'-'b');
        System.out.println('a'*'b');
        System.out.println('a'/'b');
        System.out.println('a'%'b');
        System.out.println("-----");
        //문자와 정수의 연산

        System.out.println('a'+1);
        System.out.println('a'-1);
        System.out.println('a'*1);
        System.out.println('a'/1);
        System.out.println('a'%1);
        System.out.println("-----");
        //문자와 실수의 연산
        System.out.println('a'+0.1);
        System.out.println('a'-0.1);
        System.out.println('a'*0.1);
        System.out.println('a'/0.1);
        System.out.println('a'%0.1);
        System.out.println("-----");
        //문자열과 문자열의 연산
        System.out.println("1"+"1");    //결과 11
        System.out.println("hello"+"world");

        //문자열은 +연산만 가능하며 문자열끼리 합쳐진다.

        //System.out.println("hello"-"world");
        //error: bad operand types for binary operator '-'
        //        System.out.println("hello"-"world");

        System.out.println("helloworld"+123);//string + integer 는 hellworld123
        System.out.println("helloworld"+1.23);
        System.out.println("helloworld"+'a');
        System.out.println("helloworld"+true);
        
        //논리값연산

        //논리값끼리의 연산
        //System.out.println(true+false); //error: bad operand types for binary operator '+'
        //논리값끼리 계산은 안된다.

        //논리값과 다른형태의 값 연산 안된다.

        //그러나 논리값과 문자열은 가능하다.
        System.out.println(true+"a");

    }
}
