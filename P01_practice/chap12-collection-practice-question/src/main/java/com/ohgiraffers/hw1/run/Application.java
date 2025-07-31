package com.ohgiraffers.hw1.run;
import com.ohgiraffers.hw1.view.BookMenu;

public class Application {
    public static void main(String[] args) {
        System.out.println("main start");
        //BookMenu 클래스 객체 생성하고 menu() 메소드 실행
        BookMenu bkmu = new BookMenu();
        bkmu.menu();
        //6번으로 나와서 종료
        System.out.println("return 0");
    }
}
