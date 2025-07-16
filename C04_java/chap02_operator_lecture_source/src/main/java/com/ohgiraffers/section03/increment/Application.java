package com.ohgiraffers.section03.increment;

public class Application
{
    public static void main(String[] args)
    {
        /*
        * 증감연산자
        * */
        
        int num=20;
        
        num++;
        ++num;
        num--;
        --num;
        /*
        * 다른 연산자와 함께 사용할 때 증감연산자의 의미
        * ++var : 1증가시킨후 연산
        * var++ : 다른 연산을 머저 진행후 마지막에 피연산자의 값을 1증가
        * --var :
        * var-- :
        * */
        int firstNum=20;
        int result1=firstNum++ * 3;
        System.out.println("result="+result1);
        System.out.println("firnstNum="+firstNum);

        int secondNum=20;
        int result2=++secondNum*3;
        System.out.println("result2"+result2);
        System.out.println("secondnum"+secondNum);

    }
}
