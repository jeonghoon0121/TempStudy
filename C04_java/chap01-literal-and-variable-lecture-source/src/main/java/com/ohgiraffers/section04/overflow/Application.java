package com.ohgiraffers.section04.overflow;

public class Application
{
    public static void main(String[] args)
    {
        //carry 버림, signed bit 반전 시켜 최소값으로 순환시킴

        int test01=0b10000000;
        System.out.println(test01);
        System.out.println(0b10000000);
        System.out.println(0b10000001);
        System.out.println(0b01111111);

        System.out.println((byte) 0b10000000);  //-128
        System.out.println((byte)0b10000001);   //-127
        System.out.println((byte)0b01111111);   //127
        System.out.println((byte)0b11111111);   //-1
        System.out.println((byte)0b0000000);

        System.out.println((byte)0b0000000);
        System.out.println((byte)0b11111111);
        System.out.println((byte)0b11111110);
        System.out.println((byte)0b11111101);
        System.out.println((byte)0b11111100);



//
//        byte num1=127;
//        System.out.println(num1);
//        num1++;
//        System.out.println(num1);

//        byte num2= -128;
//        System.out.println(num2);
//        num2--;
//        System.out.println(num2);
        int firstNum=1000000;
        int secondNum=700000;

        int multi =firstNum*secondNum;

        //System.out.println(multi);

        long result = (long)firstNum*secondNum;
        System.out.println(result);
        //자료형 변환 강제형변환
    }
}
