package com.ohgiraffers.section02.packagenimport;

public class Application1
{
    public static void main(String[] args)
    {
        //패키지 서로 관련있는 클래스나 뒤에서 배울 인터페이스를 모아 하나의 그룹으로 구성하는것을 패키지라고함
        //같은 패키지 내에서 동일한 이름의 클래스를 만들수 없다.
        //패키지가 다르면 동일한 이름을 가진 클래스를 만들 수 있다.

        //패키지가 다른경우 com.ohgiraffers
        //클래스명이 패키지명을 포함하고 있기 때문에
        //1.non static, static

        com.ohgiraffers.section01.method.calculator calcc= new com.ohgiraffers.section01.method.calculator();
        int min = calcc.min(30,20);
        System.out.println(min);

        int max = com.ohgiraffers.section01.method.calculator.max(30,20);
        System.out.println(max);
    }
}
