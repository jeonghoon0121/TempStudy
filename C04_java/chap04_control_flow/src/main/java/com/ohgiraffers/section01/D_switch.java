package com.ohgiraffers.section01;

import java.util.Scanner;

public class D_switch
{
    public void testSwitch()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1정수"); int num1=sc.nextInt();
        System.out.println("2정수"); int num2=sc.nextInt();
        System.out.println("연산기호+*_/%");char op=sc.next().charAt(0);
        int result=0;
        switch(op)
        {
        case '+': result=num1+num2; break;
        case '*': result=num1*num2; break;
        case '-': result=num1-num2; break;
        case '/': result=num1/num2; break;
        case '%': result=num1%num2; break;
        }
        System.out.println(result);
    }
    public void testVendingMaichine()
    {
        System.out.println();
        System.out.println("ABCDE");
        int price=0;
        char order;
        Scanner sc3=new Scanner(System.in);
        char selectedFruits=sc3.next(sc3);
        switch(selectedFruits)
        {
            case 'A':order='A';price=1000; break;
            case 'B':order='B';price=2000; break;
            case 'C':order='C';price=3000; break;
            case 'D':order='D';price=4000; break;
            case 'E':order='E';price=5000; break;
            System.out.println(selectedFruits);
        }
    }
}
