package com.ohgiraffers.section01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C_ifElse
{
    public void test5()
    {
        System.out.println("1금2은3쇠");
        Scanner sc = new Scanner(System.in);
        int ans=sc.nextInt();
        if(ans==1)
        {
            System.out.println("N");
        }
        else if(ans==2)
        {
            System.out.println("N");
        }
        else if(ans==3)
        {
            System.out.println("N");
        }
        else
        {
            System.out.println("Y");
        }
        System.out.println("return 0");
        /*90이상 A 80B 70C 60D  F
        * 95,85,75등 +
        *
        *
        * */
        System.out.println("1금2은3쇠");

        Scanner sc2=new Scanner(System.in);
        System.out.println("이름");
        String name=sc2.nextLine();
        String stu1;
        int point;
        System.out.println("점수");
        point = sc2.nextInt();

        String grade;

        if(point>=90){grade="A"; if(point>=95){grade="A+";}}
        else if(point>=80){grade="B"; if(point>=85){grade="B+";}}
        else if(point>=70){grade="C"; if(point>=75){grade="C+";}}
        else if(point>=60){grade="D"; if(point>=65){grade="D+";}}
        else if(point>=50){grade="E"; if(point>=55){grade="E+";}}
        else{grade="E";}

        System.out.println(name+grade);

    }
}
