package com.ohgiraffers.hw1.controller;
import com.ohgiraffers.hw1.modle.dto.BookDTO;

public class BookManagerTest {
    public static void main(String[] args) {
        BookManager bm=new BookManager();
        BookDTO bto=new BookDTO(3,1,"1","1");
        BookDTO bto2=new BookDTO(2,2,"23","3");
        BookDTO bto3=new BookDTO(1,2,"22","3");
        BookDTO bto4=new BookDTO(4,2,"21","3");
        BookDTO bto5=new BookDTO(5,3,"2","3");
        BookDTO bto6=new BookDTO(6,3,"2","3");
        bm.addBook(bto);
        bm.addBook(bto2);
        bm.addBook(bto3);
        bm.addBook(bto4);
        bm.addBook(bto5);
        bm.addBook(bto6);
       // bm.deleteBook(0);
//        bm.printBook(0);
//        bm.displayAll();
//       bm.printBookList(bto);

    }
}
