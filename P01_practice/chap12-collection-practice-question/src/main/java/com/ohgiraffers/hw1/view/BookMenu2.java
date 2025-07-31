//package com.ohgiraffers.hw1.view;
//
//import com.ohgiraffers.hw1.controller.BookManager;
//import com.ohgiraffers.hw1.modle.dto.BookDTO;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class BookMenu2 {
//
//    private final Scanner sc = new Scanner(System.in);
//    private final BookManager bm = new BookManager();
//    public BookMenu2() {}
//    public void menu() {
//        while (true) {
//            System.out.println("\n📚 *** 도서 관리 프로그램 ***");
//            System.out.println("1. 새 도서 추가");
//            System.out.println("2. 도서정보 정렬 후 출력");
//            System.out.println("3. 도서 삭제");
//            System.out.println("4. 도서 검색 출력");
//            System.out.println("5. 전체 도서 목록 출력");
//            System.out.println("6. 프로그램 종료");
//            System.out.print("메뉴 번호 선택 : ");
//
//            int choice = Integer.parseInt(sc.nextLine());
//
//            switch (choice) {
//                case 1 -> bm.addBook(inputBook());
//                case 2 -> sortAndPrint();
//                case 3 -> deleteBookByTitle();
//                case 4 -> searchAndPrint();
//                case 5 -> bm.displayAll();
//                case 6 -> {
//                    System.out.println("👋 도서 관리 프로그램을 종료합니다.");
//                    return;
//                }
//                default -> System.out.println("⚠️ 잘못 입력하셨습니다. 다시 선택해주세요.");
//            }
//        }
//    }
//
//    private BookDTO inputBook() {
//        System.out.print("도서 제목 : ");
//        String title = sc.nextLine();
//
//        System.out.print("도서 장르 (1: 인문 / 2: 자연과학 / 3: 의료 / 4: 기타) : ");
//        int category = Integer.parseInt(sc.nextLine());
//
//        System.out.print("도서 저자 : ");
//        String author = sc.nextLine();
//
//        return new BookDTO(category, title, author);
//    }
//
//    private String inputBookTitle() {
//        System.out.print("도서 제목 : ");
//        return sc.nextLine();
//    }
//
//    private void sortAndPrint() {
//        System.out.print("정렬 방식 선택 (1. 오름차순 / 2. 내림차순) : ");
//        int sortType = Integer.parseInt(sc.nextLine());
//        ArrayList<BookDTO> sorted = bm.sortedBookList(sortType);
//        bm.printBookList(sorted);
//    }
//
//    private void deleteBookByTitle() {
//        String title = inputBookTitle();
//        int index = 0;
//        if (index != -1) {
//           // bm.printBook(index); // 삭제 전 확인
//            //bm.deleteBook(index);
//            System.out.println("✅ 도서가 삭제되었습니다.");
//        } else {
//            System.out.println("❌ 해당 도서를 찾을 수 없습니다.");
//        }
//    }
//
//    private void searchAndPrint() {
//        String title = inputBookTitle();
//        //int index = bm.searchBook(title);
//
//    }
//}
