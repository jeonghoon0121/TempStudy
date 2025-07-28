package com.ohgiraffers.practice02.level02.normal.book.model.dto.bookDTO;

public class BookDTO {
    private String title;
    private String pubisher;
    private String author;
    private int price;
    private double discountRate;

    public BookDTO(){}
    public BookDTO(String title,String publisher, String author ){
        this.title=title;
        this.pubisher=publisher;
        this.author=author;
    }
    public BookDTO(String title, String publisher, String author, int price, double discountRate){
        this.title=title;
        this.pubisher=publisher;
        this.author=author;
        this.price=price;
        this.discountRate=discountRate;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setPubisher(String publisher){
        this.pubisher=publisher;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setDiscountRate(double discountRate){
        this.discountRate=discountRate;
    }
    public String getTitle(){
        return this.title;
    }
    public String getPublisher(){
        return this.pubisher;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getPrice(){
        return this.price;
    }
    public double getDiscountRate(){
        return this.discountRate;
    }

    public void printInformation(){
        System.out.println(this.title);
        System.out.println(this.pubisher);
        System.out.println(this.author);
        System.out.println(this.price);
        System.out.println(this.discountRate);
    }

}
