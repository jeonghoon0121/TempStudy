package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.modle.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {
    private final Scanner sc = new Scanner(System.in);
    private final BookManager bm = new BookManager();
    public BookMenu() {}
    public void menu() {
        while(true){
            System.out.println(" *** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색 출력");
            System.out.println("5. 전체 도서 목록 출력");
            System.out.println("6. 프로그램 종료");
            System.out.print("메뉴 번호 선택 : ");
            int num=sc.nextInt();
            switch(num){
                case 1: System.out.println("1");
                case 2: System.out.println("2");
                case 3: System.out.println("3");
                case 4: System.out.println("4");
                case 5: System.out.println("5");
                case 6: System.out.println("6");
                default:
                    System.out.println("error");
            }
        }

    }
    public BookDTO inputBook() {
        int category=0;
        String title ="";
        String author="test";
        Scanner sc = new Scanner(System.in);
        category = sc.nextInt();
        sc.nextLine();
        title = sc.nextLine();
        author = sc.nextLine();
        BookDTO BDTO=new BookDTO(category,title,author);
        return BDTO;
    }

}