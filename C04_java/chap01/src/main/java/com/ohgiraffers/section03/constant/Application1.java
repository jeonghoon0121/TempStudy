package com.ohgiraffers.section03.constant;

public class Application1 
{
    public static void main(String[] args) 
    {
        //상수 1. 고정된 값, 값 수정시 컴파일 에러
        /*
            상수선언, final
            값대입, 초기화, 재할당 불가능ㄴ
            대문자로 하기
        */
        final int AGE;
        AGE=20;
        System.out.println(AGE);
        int sum=AGE;
        //int AGE=AGE+10; //error: illegal start of type

        /*
                암묵명시
                1.영문대문자와 숫자사용
                2.언더바
                3.스네이크 케이스
        */
        final int AGE1=20;
        int age3=40;

        final int MAX_AGE=60;
        int minAge=30;
    }
}
