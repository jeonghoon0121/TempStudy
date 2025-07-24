package com.ogiraffers.section01.section02.uses;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*요구사항
        * 1,여러명의 회원 정보를 받아 한번에 여러 회원 정보를 등록
        * 2. 전체 회원 조희 시 여러 명의 회원 정보를 반환
        *
        * 제약사항
        * 1. MemberRepository static필드로 회원정보를 관리
        * 2. 회원정보는 최대 10ㅁ병 까지 저장가능*/
        Scanner sc=new Scanner(System.in);
        MemberService memberService =new MemberService();
        while(true){
            System.out.println("----회원관리프로그램----");
            System.out.println("1회원등록");
            System.out.println("2회원조회");
            System.out.println("9종료");
            System.out.println("메뉴선택");
            int no =sc.nextInt();

            switch(no){
                case 1: memberService.signupMemberS();
                case 2:memberService.showAllMembers();
                case 9:
                    System.out.println("프로그램 종료"); break;
                default:
                    System.out.println("잘못된 번호 입력"); break;

            }



        }
    }

}
