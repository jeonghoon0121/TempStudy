package com.ohgiraffers.section06.ternary;

public class Application
{
    public static void main(String[] args)
    {
        /*3항 연산자*/
        int num1=10;
        int num2=-10;
        int num3=0;

        String result1=(num1>0)? "양수":(num1==0)? "0":"음수";
        System.out.println(result1);

        String result2=(num2>0)? "양수":(num2==0)? "0":"음수";
        System.out.println(result2);

        String result3=(num3>0)? "양수":(num3==0)? "0":"음수";
        System.out.println(result3);
    }
}
