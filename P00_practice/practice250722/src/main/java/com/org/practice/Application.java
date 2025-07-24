package com.org.practice;
/*
*
*
*chap06-section03-abstraction을 참고하여 객체지향프로그래밍
1. 프로그램 개요와 시스템 요구사항 도출
2. 프로그램 설계(필요한 객체 도출 및 객체간 상호작용 시 각 객체가 수신할 수 있는 메세지 도출)
3. 프로그래밍
4. 팀 코드 리뷰
*
* 프로그램 개요
*   이름 : 자판기 소프트웨어
*   목표 : 객체지향에 대한 프로그램에 대한 이해
*   내용 : 객체이해
*   
*   시스템 요구사항 1.객체지향 프로그래밍
*                       객체사용,캡슐화 유지,추상화 유지,상속,다형성 유지 결합도 낮음
*                   2.코드 스타일 유지
*
*   프로그램 설계 객체, 객체들 관의 관계, 객체의 상호작용 -> 상호작용에 필요한 메소드와 필드
*   사용자, 자판기, 음료수
*
*   상호작용 사람 -> 자판기 -> 음료수
* 1. 사람->자판기 메소드 돈넣기, 버튼누르기,
* 2. 자판기는 돈의 유무에 따라 상태가 나눠진다.
* 3.돈이 있는경우 음료수를 준다.
* 4.돈이 없는경우 음료수를 주지 않는다.
* 5.
*
* */


import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //VendingMachine vendMachine = new VendingMachine("사이다");
        VendingMachine vendMachine = new VendingMachine();
        Scanner sc= new Scanner(System.in);
        System.out.println("1돈넣기, 2버튼 3종료");
        while(true)
        {
            int no =sc.nextInt();
            if(no==1){
                System.out.println("돈을 넣었습니다. ");
                vendMachine.insertMoney();
            }
            if(no==2){
                System.out.println("버튼누릅니다.");
                vendMachine.pushButton();
            }
            if(no==3){
                System.out.println("return 0");
                break;
            }
        }
    }
}
