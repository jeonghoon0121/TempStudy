package com.ohgiraffers.hw1.controller;
import com.ohgiraffers.hw1.modle.dto.BookDTO;

import java.awt.print.Book;
import java.util.ArrayList;

public class BookManager {
    private ArrayList<BookDTO> bookList;
    public BookManager(){
        bookList=new ArrayList<BookDTO>();
//        System.out.println("checked");
    }
    public void addBook(BookDTO inputDTO){
        bookList.add(inputDTO);
       System.out.println("checked");
        System.out.println(bookList.get(0));
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
    public void displayAll(ArrayList<BookDTO>inputList){

        for(int i=0;i<inputList.size();i++){
            System.out.println(inputList.get(i));
        }
//        System.out.println("check");
    }
    public ArrayList<BookDTO> sortedBookList(int select){
        ArrayList<BookDTO> sortedList =new ArrayList<>();
        for(int i=0;i<bookList.size();i++){
            if(bookList.get(i).getCategory()==select){
                sortedList.add(bookList.get(i));
            }
            else{
            }
        }
//        System.out.println("checked");
        return sortedList;
    }
    public void printBookList(ArrayList<BookDTO> br){
        for(BookDTO book : br){
            System.out.println(book);
            System.out.println("check");
        }
    }




}
