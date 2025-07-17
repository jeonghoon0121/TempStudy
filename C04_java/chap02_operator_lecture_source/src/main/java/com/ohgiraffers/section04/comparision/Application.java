package com.ohgiraffers.section04.comparision;

public class Application
{
    public static void main(String[] args)
    {
        /*비교연산자는 피연산자 사이에 상대적인 크기를 판단해서 true,false반환
        * 삼항연산자 조건식이나 조건문의 조건절에 많이 사용
        * */

        /*비교연사자 종류
        * ==,!=, >, >=, <, <=
        * */

        int inum1=10;
        int inum2=20;
        System.out.println(inum1==inum2);
        System.out.println(inum1!=inum2);
        System.out.println(inum1>inum2);
        System.out.println(inum1>=inum2);
        System.out.println(inum1<inum2);
        System.out.println(inum1<=inum2);

        double dnum1=10.0;
        double dnum2=20.0;

        System.out.println(dnum1==dnum2);
        System.out.println(dnum1!=dnum2);

        char ch1='a';
        char ch2='A';

        System.out.println(ch1==ch2);
        System.out.println(ch1!=ch2);
        System.out.println(ch1>ch2);
        System.out.println(ch1>=ch2);
        System.out.println(ch1<=ch2);
        System.out.println(ch1<=ch2);

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(bool1==bool2);
        System.out.println(bool1!=bool2);
//        System.out.println(bool1>bool2);
//        System.out.println(bool1>=bool2);
        //논리값은 대소비교 불가능함

        /*문자열값 비교*/
        String str1 ="java";
        String str2="java";

        System.out.println(str1==str2);
        System.out.println(str1!=str2);
    }
}
