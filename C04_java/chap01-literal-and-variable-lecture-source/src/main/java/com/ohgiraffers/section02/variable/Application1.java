package com.ohgiraffers.section02.variable;

public class Application1
{
    public static void main(String[] args) {
        //변수는 왜 사용해야하는가? 1.의미부여 2. 재사용 3. 변하는 값저장
        System.out.println("보너스를 포함한 급여" + (1000000 + 20000) + "원");

        int salary = 1000000;
        int bonus = 20000;
        System.out.println("보너스를 포함한 급여" + (salary + bonus) + "원");   //숫자에 의미부여

        System.out.println("1번 고객에게 포인트를 100포인트 지급했다.");
        System.out.println("2번 고객에게 포인트를 100포인트 지급했다.");
        System.out.println("3번 고객에게 포인트를 100포인트 지급했다.");
        System.out.println("4번 고객에게 포인트를 100포인트 지급했다.");
        System.out.println("5번 고객에게 포인트를 100포인트 지급했다.");
        System.out.println("6번 고객에게 포인트를 100포인트 지급했다.");
        System.out.println("7번 고객에게 포인트를 100포인트 지급했다.");
        System.out.println("8번 고객에게 포인트를 100포인트 지급했다.");
        System.out.println("9번 고객에게 포인트를 100포인트 지급했다.");
        System.out.println("10번 고객에게 포인트를 100포인트 지급했다.");

        //재사용을 하기 위해서
        int point;
        point = 100;
        point = 200;

        System.out.println("1번 고객에게 포인트를" + point + "포인트를 지급했다.");
        System.out.println("2번 고객에게 포인트를" + point + "포인트를 지급했다.");
        System.out.println("3번 고객에게 포인트를" + point + "포인트를 지급했다.");
        System.out.println("4번 고객에게 포인트를" + point + "포인트를 지급했다.");
        System.out.println("5번 고객에게 포인트를" + point + "포인트를 지급했다.");
        System.out.println("6번 고객에게 포인트를" + point + "포인트를 지급했다.");
        System.out.println("7번 고객에게 포인트를" + point + "포인트를 지급했다.");
        System.out.println("8번 고객에게 포인트를" + point + "포인트를 지급했다.");
        System.out.println("9번 고객에게 포인트를" + point + "포인트를 지급했다.");
        System.out.println("10번 고객에게 포인트를" + point + "포인트를 지급했다.");


        //변하는 값을 사용할때

        int sum = 0;

        sum+=10;
        System.out.println(sum);
        sum+=10;
        System.out.println(sum);

    }}
