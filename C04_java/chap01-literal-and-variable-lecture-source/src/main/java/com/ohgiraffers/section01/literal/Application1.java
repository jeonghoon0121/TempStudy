package com.ohgiraffers.section01.literal;

public class Application1
{
    public static void main(String[] args)
    {
        //literal 값 , 여러가지 값을 출력
        System.out.println("start");
        //1.1integer
        System.out.println(100);
        //1.2float
        System.out.println(1.23);

        //2.1char single quotation
        System.out.println('a');
        //System.out.println('aa'); error: unclosed character literal
        //System.out.println(''); error: empty character literal
        System.out.println('1');
        //3.1string
        System.out.println("안녕하세요");
        System.out.println("123");  //String 취급
        System.out.println("");     //빈공간 문자열 취급
        System.out.println("a");

        // 'a',97 != "a" 서로 다르다.
        //4 true,false
        System.out.println(true);
        System.out.println(false);
    }
}
