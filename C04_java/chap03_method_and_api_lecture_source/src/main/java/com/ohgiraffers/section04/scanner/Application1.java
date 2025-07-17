package com.ohgiraffers.section04.scanner;

public class Application1
{
    public static void main(String[] args)
    {
        //comment java.util.scanner

        java.util.Scanner sc1=new java.util.Scanner(java.lang.System.in);
        java.util.Scanner sc2=new java.util.Scanner(System.in);

        System.out.println();
        
        //문자열 입력받기
        //nextLine()
        System.out.println("이름입력");

        String name1= sc1.nextLine();
        System.out.println(name1);
        System.out.println("나이입력");

        int age1=sc1.nextInt();
        System.out.println(age1);

        System.out.println("금액입력");
        long money = sc1.nextLong();

        //2-3 nextFloat

        System.out.println("키입력");
        float height =sc2.nextFloat();
        System.out.println(height);

        System.out.println("실수");
        double number =sc2.nextDouble();
        System.out.println(number);


        System.out.println("블");
        boolean iT =sc2.nextBoolean();
        System.out.println(iT);
        //버퍼 없애기
        sc2.nextLine();

        System.out.println("문자");
        char ch=sc2.nextLine().charAt(5); //0~6까지
        System.out.println("입력문자는 "+ch+"이다");
    }
}
