package com.ohgiraffers.section01.literal;

public class Application3
{
    public static void main(String[] args)
    {
        System.out.println(9+9);    //18
        System.out.println("9"+9);  //문자열 99
        System.out.println(9+"9");     //문자열    99
        System.out.println("9"+"9");

        System.out.println(9+9+"18");
        // 9+9+"18" -> 18+"18" _> "1818" 출력

        System.out.println(9+"9"+9);
        //9+"9"+9 -> "99"+ "9" ->"999"

        System.out.println("9"+9+9);
        //918
        System.out.println("9"+(9+9));

        System.out.println("10+20="+(10+20));
    }
}
