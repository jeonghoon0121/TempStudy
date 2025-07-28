package com.ohgiraffers.practice02.level101.basic.member.model.dto;


public class MemberDTO {

    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;
    private String phone;
    private String email;

    public MemberDTO(){}

    public MemberDTO(String id, String pwd, String name,
        char gender,int age, String phone, String email) {
        this.id=id;
        this.pwd=pwd;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.phone=phone;
        this.email=email;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setPwd(String pwd){
        this.pwd=pwd;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getId(){
        return this.id;
    }
    public String getPwd(){
        return this.pwd;
    }

    public String getName(){
        return  this.name;
    }
    public char getgender(){
        return this.gender;
    }
    public String getPhone(){
        return this.phone;
    }
    public String getEmail(){
        return this.email;
    }
    public int getAge(){
        return age;
    }
}


