package com.ohgiraffers.section01.method;

import org.w3c.dom.ls.LSOutput;

import java.util.Calendar;

public class Application9
{
    /* 다른 클래스
    * 
    * */
    public static void main(String[] args)
    {
        int first=100;  int second =50;
        calculator calc = new calculator();
        int min = calc.min(first,second);
        System.out.println(min);
        int max=calculator.max(first,second);//권장x
        System.out.println(max);
    }
    //주의사항 static메소드도 non-static메소드처럼 호출 가능
    //객체상태를 추적하기 원함


}
