package com.ohgiraffers.section02.variable;

public class Application2
{
    public static void main(String[] args)
    {
        // 변수를 선언하고 값을 할당하여 사용가능
        //선언 대입 사용
        
        /*기본자료형, 참조자료형
        * 
        * */

        //정수를 취급하는 자료형 byte short int float

        byte bn1;   //1byte
        short sn1;  //2
        int in1;    //4
        long ln1;   //8

        //실수를 취급하는 자료형 2가지

        float fn1; //4byte
        double dn1; //8byte

        //문자

        char cv1, cv2; //2byte
        boolean bv1; //1byte

        
        //참조자료형
        String str1; //4byte
        /*************************************************/
        bn1=1;  sn1=2;  in1=4; ln1=8L;
        //long 타입은 대문자 권장
        fn1=4.0f;
        //소문자를 사용
        dn1=8.0;

        cv1=97; cv2='a'; //숫자 또는 문자로 저장 가능

        bv1=true;

        str1="안녕하세요!";

        //System.out.println(&str1); error: illegal start of expression

        int point1=100;
        int bonus1=10;

        //변수를 사용한다.

        System.out.println("bum ="+bn1);

        //변수를 사용한다. -> 연산한다.
        System.out.println("포인트와 보너스의합은?"+(point1+bonus1));

        //변수를 사용한다. -> 연산한다.

    }
}
