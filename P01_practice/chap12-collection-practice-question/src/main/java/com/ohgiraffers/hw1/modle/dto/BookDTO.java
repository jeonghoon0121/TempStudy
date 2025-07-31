package com.ohgiraffers.hw1.modle.dto;



public class BookDTO {
    private int bNo;  //도서번호
    private int category;   //도서분류코드
    private String title;   //도서제목
    private String author;  //도서저자

    public BookDTO(){}
    public BookDTO( int category, String title, String author) {
        this.category = category;
        this.title = title;
        this.author = author;
    }
    public BookDTO(int bNo, int category, String title, String author) {
        this.bNo=bNo;
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public int getbNo(){
        return bNo;
    }

    //  카테고리명 변환 (1~4 -> 텍스트)
    private String getCategoryName() {
        return switch (category) {
            case 1 -> "인문";
            case 2 -> "자연과학";
            case 3 -> "의료";
            case 4 -> "기타";
            default -> "Error";
        };
    }

    @Override
    public String toString() {
        return String.format(
                "%d/%s/%s/%s",
                bNo, title, author, getCategoryName()
        );
    }

}
