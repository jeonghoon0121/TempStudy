package com.ogiraffers.section03.section04.dto;

import com.ogiraffers.section03.section04.constructor.User;

public class UserDTO {
    private String id;
    private String pw;
    private String name;
    private java.util.Date enrollDate;

    public UserDTO(){}

    public UserDTO(String id, String pwd,String name,java.util.Date enrollDate){
        this.id=id;
        this.pw=pwd;
        this.name=name;
        this.enrollDate=enrollDate;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setPw(String pw){
        this.pw=pw;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEnrollDate(java.util.Date enrollDate){
        this.enrollDate=enrollDate;
    }
    public String getId(){
        return id;
    }
    public String getPw(){
        return pw;
    }
    public String getName(){
        return name;
    }
    public java.util.Date getEnrollDate(){
        return enrollDate;
    }
    public String getInformation(){
        return "UserDTO [id="+this.id+", pwd="+this.pw+", name="+this.name+", enrollDate="+this.enrollDate+"]";
    }


}
