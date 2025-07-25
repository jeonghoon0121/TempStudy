package com.ogiraffers.section03.dto;

public class MemberDTO {
    /*
    취급하려고 하는 회원정보를 고려해서 필드를 작성
    주로 화면 또는 데이터베이스테이블을 기준
    회원번호 또는 회원명
    * */
    private int number;
    private String name;
    private int age;
    private char gender;
    private double height;
    private double weight;
    private boolean isActivated;    //탈퇴여부

    public void setNumber(int number){
        this.number=number;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public void setActivated(boolean isActivated){
        this.isActivated=isActivated;
    }
    public int getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getGender(){
        return gender;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
    public boolean isActivated(){
        return isActivated;
    }
}
