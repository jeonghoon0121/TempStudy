package com.ojraffers.prad;

public class Application
{
    public static void main(String[] args)
    {
        int i,j;
        i=1;j=2;

        int b = (i<j) ? 2 : 1;
        System.out.println(b);

        int k=10;//입력전수

        String c;// 최종문자열
        c= (k>=60) ? "합": "불";
        System.out.println(c);

        int l=10;
        String d;
        d=((l%2)==1)? "홀":"짝";
        System.out.println(d);
    }

}
