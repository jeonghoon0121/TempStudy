package com.ogiraffers.section04.constructor;

public class Applicatiion {
    public static void main(String[] args) {
        User user1=new User();
        System.out.println(user1.getInformation());

        User user2=new User("user02","pass01","홍길동");
        System.out.println(user2.getInformation());
        //모든필드를 초기화시키는 생성자
        User user3=new User("User01","pass01","유관순",new java.util.Date());
        System.out.println(user3.getInformation());
    }

}
