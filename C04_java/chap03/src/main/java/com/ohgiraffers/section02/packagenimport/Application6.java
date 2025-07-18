package com.ohgiraffers.section02.packagenimport;

import com.ohgiraffers.section01.method.calculator;
import static com.ohgiraffers.section01.method.calculator.max;
public class Application6
{
    public static void main(String[] args)
    {
        //패키지명 생략하게 만듬    
        //미리선언

        //1.non static
        //2.static    alt shift enter
        //->import com.ohgiraffers.section01.method.calculator;
        calculator calc = new calculator();
        calc.min(50,60);

        int max = calculator.max(50,60);

        //3 static 메소드를 호출할 때 클래스명 생략하고 사용

        int max2=max(100,200);
    }
}
