package com.ohgiraffers.section01;

import java.util.Scanner;

public class B_ifelse
{
    public void test3()
    {
            /*
            * 정수1개 입력, 그수가 홀수 입력하신숫자 홀수출력
            * 홀수아니면 입력숫자 짝수, 라고 출력하는 프로그램작성
            * 단 조건과 상관없이 프로그램 종료될때 프로그램을 종료라고 출력
            * */
        int num;
        Scanner sc3 = new Scanner(System.in);
            System.out.println("정수입력");
            num= sc3.nextInt();
        if(num%22!=0){
            System.out.println("홀");
        }
        else{
            System.out.println("짝");
        }
        System.out.println("종료");

    }
    public void test4()
    {
        /*숫자 1개 입력, 양수면 입력하신 숫자 양수출력
        * 음수면 입력하신 숫자는 음수
        * 단 0이면 0이다 출력
        * 단 조건과 상관없이  프로그램이 종료
        */
        Scanner sc4= new Scanner(System.in);
        System.out.println("입력");
        int num=sc4.nextInt();
        if(num==0)
        {
            System.out.println("0");
        }
        else if(num<0)
        {
            System.out.println("음수");
        }
        else if(num>0)
        {
            System.out.println("짝수");
        }
        else
        {
            System.out.println("end");
        }

        System.out.println("종료");
    }
}
