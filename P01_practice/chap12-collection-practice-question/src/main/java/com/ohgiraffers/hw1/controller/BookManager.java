package com.ohgiraffers.hw1.controller;
import com.ohgiraffers.hw1.modle.dto.BookDTO;
import java.util.ArrayList;

public class BookManager {
    private ArrayList<BookDTO> bookList;
    public BookManager(){
        bookList=new ArrayList<BookDTO>();
//        System.out.println("checked");
    }
    public void addBook(BookDTO inputDTO){
        bookList.add(inputDTO);
//        System.out.println("checked");
    }
    public void deleteBook(int index) {
        bookList.remove(index);
//        System.out.println("checked");
    }
    public void printBook(int index){
        System.out.println(bookList.get(index));
//        System.out.println("checked");
    }
    public void displayAll(){

        for(int i=0;i<bookList.size();i++){
            System.out.println(bookList.get(i));
        }
//        System.out.println("check");
    }
    public ArrayList<BookDTO> sortedBookList(int select){
        return new ArrayList<>( new BookDTO(1, """
                ""));
    }


}
