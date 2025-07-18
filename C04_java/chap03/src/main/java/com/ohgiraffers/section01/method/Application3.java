package com.ohgiraffers.section01.method;

import org.w3c.dom.ls.LSOutput;

public class Application3
{
    public static void main(String[] args)
    {

        Application3 app3 = new Application3();
        //app3.testMethod();
        //argument parameter
        //1.지역변수, 2.매개변수, 3.전역변수, 필드 4. 클래스변수, static
        int age=20;
        app3.testMethod(age);
        
        byte byage=10;  //자동형변환
        app3.testMethod(byage);
        
        long longAge=80L;   //강제형변환
        app3.testMethod((int)longAge);

        app3.testMethod(age*3);//연산결과를 전달
    }
    //지역변수 스코프 -> 선언한 메소드 블럭내부에 사용가능
    //다른 메소드간 공유하는 값은 전달인자 argument로 전달하고
    //매개변수를 받기위해 하는것은 매개변수라 함 param

    public void testMethod (int age)
    {
        System.out.println("당신의 나이는"+age+"살이다. ");
    }

}
