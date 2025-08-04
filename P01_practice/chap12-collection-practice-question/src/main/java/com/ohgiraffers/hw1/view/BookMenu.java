package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.modle.dto.BookDTO;

import java.util.ArrayList;
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
                case 1:
                    System.out.println("1");
                    bm.addBook(inputBook());
                    bm.addBook(inputBook());
                    bm.addBook(inputBook());
                    System.out.println("1END");
                case 2: System.out.println("2");
//                    bm.printBook(0);
                case 3: System.out.println("3");
                case 4: System.out.println("4");
                case 5: System.out.println("5");
                    bm.displayAll();
                case 6: System.out.println("6");
                default:
                    System.out.println("error");
            }
        }

    }
    public BookDTO inputBook() {
        System.out.println("test1");
        System.out.print("카테고리(1,2,3,4) :");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.print("제목 : ");
        String title = sc.nextLine();
        System.out.print("작가 : ");
        String author = sc.nextLine();
        System.out.println(category+title+author);
        BookDTO BDTO=new BookDTO(category,title,author);
        return BDTO;
    }
    String inputBookTitle(){
        String title =sc.nextLine();
        return title;
    }

}