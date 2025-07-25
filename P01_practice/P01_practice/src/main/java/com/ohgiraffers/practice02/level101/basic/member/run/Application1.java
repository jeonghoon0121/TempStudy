package com.ohgiraffers.practice02.level101.basic.member.run;

import com.ohgiraffers.practice02.level02.normal.book.model.dto.bookDTO.BookDTO;

public class Application1 {
    public static void main(String[] args) {
        BookDTO bdto1=new BookDTO();

        bdto1.printInformation();


        BookDTO bdto3=new BookDTO("자바의 정석","도우출판","남궁성");
        bdto3.printInformation();
        BookDTO bdto2=new BookDTO("홍길동전","활빈당","허균",5000000,0.5);
        bdto2.printInformation();

    }
}
