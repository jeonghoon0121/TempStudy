package com.ogiraffers.section03.abstraction;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*추상화
         *
         * */
        /*카레이서가 자동차를 운전하는 프로그램
         * 시스템 요구사항
         *
         * 1. 시동걸기 엑셀 브레이크 시동끄기
         * 2. 자동차 시동걸기, 앞으로가기, 스탑, 시동 끄기
         * 3. 카레이서는 먼저 자동차에 시동을 건다.
         * 4이미 걸려있는경우 다시 시동 못건다.
         * 5시동이 걸린경우 엑셀밟으면 시속10km/h증가
         * 6.시동이 걸린경우 브레이크 시속 감소
         * 7.브레이크 밟을때 멈춘상태면 멈춘상태라 안내
         * 8. 카레이서가 시동을 끄면 자동차는 움직이지 앟음
         * 9.달리는 도중 시동못끔
         */


        /*프로그램 설계하기 
        1.필요한 객체 도출
            사용자, 카레이서, 자동차
        2.객체간 상호작용
            카레이서 수신메시지 1.시동끄기 2.시동키기 3. 엑셀 밟기, 4. 브레이크밟기
        *
        자동차 수신메시지 1.시동 걸기, 2.앞으로가기 3.멈추기. 4.시동끄기
        * */
        CarRacer racer = new CarRacer();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("카레이싱프로그램");
            System.out.println("1.시동켜기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동끄기");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴선택:");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    racer.startUp();
                    break;
                case 2:
                    racer.stepAccelator();
                    break;
                case 3:
                    racer.stepBreak();
                    break;
                case 4:
                    racer.turnOff();
                    break;
                case 9:
                    System.out.println("프로그램 종료합니다. ");
                    break;
                default:
                    System.out.println("잘못 선택했습니다.");
                    break;
            }
            if (no == 9) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
