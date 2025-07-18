package com.ohgiraffers.section01.method;

public class Application4
{
    public static void main(String[] args)
    {
        Application4 app4 = new Application4();
        app4.testMethod("홍길동",20,'M');
        
        String name="유";
        int age =20;
        char gender='여';
    }

    public void testMethod (String name,int age, final char gender)
    {
        System.out.println(name+age+gender);
    }
}