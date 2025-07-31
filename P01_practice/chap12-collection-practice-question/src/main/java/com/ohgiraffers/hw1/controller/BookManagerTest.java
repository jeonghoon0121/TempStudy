package com.ohgiraffers.hw1.controller;
import com.ohgiraffers.hw1.modle.dto.BookDTO;

public class BookManagerTest {
    public static void main(String[] args) {
        BookManager bm=new BookManager();
        BookDTO bto=new BookDTO(1,1,"1","1");
        BookDTO bto2=new BookDTO(2,2,"2","3");
        BookDTO bto3=new BookDTO(3,2,"2","3");
        bm.addBook(bto);
        bm.addBook(bto2);
        bm.addBook(bto3);
       // bm.deleteBook(0);
//        bm.printBook(0);
        bm.displayAll();
    }
}
