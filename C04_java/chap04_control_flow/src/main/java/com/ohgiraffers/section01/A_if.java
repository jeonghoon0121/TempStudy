package com.ohgiraffers.section01;

import java.util.Scanner;

public class A_if
{
    public void test1()
    {
        //if문 단독
        Scanner sc1=new Scanner(System.in);
        int intnum1;
        System.out.println("숫자입력");
        intnum1=sc1.nextInt();
        
        if(intnum1%2==0)
        {
            System.out.println("짝수");
        }

        System.out.println("프로그램종료");
    }
    public void test2()
    {
        Scanner sc3=new Scanner(System.in);
        System.out.println("숫자입력");
        int num=sc3.nextInt();
        if(num>0)
        {
            if(num%2==0)
            {
                System.out.println("양수,짝수");
            }
        }
        System.out.println("프로그램종료");
    }
}
