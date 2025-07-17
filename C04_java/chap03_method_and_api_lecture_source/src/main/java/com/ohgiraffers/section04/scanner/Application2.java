package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2
{
    public static void main(String[] args)
    {
        /**/
        Scanner sc=new Scanner(System.in);

        System.out.println("인사말");
        String gr1=sc.nextLine();//공백을 포함해서 반환함

        System.out.println("인사말");
        String gr2=sc.next();//공백전까지만 읽어서 반환

        System.out.println(gr1+gr2);
    }
}
