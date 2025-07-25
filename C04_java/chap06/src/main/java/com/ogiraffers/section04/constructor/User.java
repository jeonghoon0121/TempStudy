package com.ogiraffers.section04.constructor;

public class User {
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;
    
    
    //1, 기본생성자
    public User(){
        System.out.println("User클래스 기본생성자");
    }
    // 2. 중복안됨
    //public User(){}
    
    //3매개변수 있는 생성자
    public User(String id, String pwd, String name){
        this.id=id;
        this.pwd=pwd;
        this.name=name;
        System.out.println("user클래스의 매개변수 있는 생성자");
    }

    //4  id, pwd name , enroll Data
    public User(String id, String pwd, String name, java.util.Date enrollDate){
        //매개변수로 전달 받은 값을 이용해 모든필드를 초기화
//        this.id=id;
//        this.pwd=pwd;
//        this.name=name;
//        this.enrollDate=enrollDate;

        this(id,pwd,name);
        this.enrollDate=enrollDate;

        System.out.println("User클래스의 모든 필드를 초기화하는 생성자 호출함");

    }
    public String getInformation(){
        return "User ["+
                "id="+this.id+", "+
                "pwd="+this.pwd+", "+
                "name="+this.name+", "+
                "enrollDate"+this.enrollDate+"]";
    }
}
