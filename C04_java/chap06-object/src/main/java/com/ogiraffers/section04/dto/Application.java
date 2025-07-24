package com.ogiraffers.section04.dto;



public class Application {
    public static void main(String[] args) {
        /*생성자를 위한 초기화
        * 장점 :setter 메소드를 여러번 호출하지 않고 단한번의 호출로 인스턴스 생성및 초기화 가능*/
    UserDTO user01=new UserDTO();
        System.out.println(user01.getInformation());
        System.out.println("test");
        user01.setId("o");
        user01.setPw("o");
        user01.setName("o");
        user01.setEnrollDate(new java.util.Date());
        System.out.println(user01.getInformation());


        UserDTO user02=new UserDTO("id02","pw02","홍길동",new java.util.Date());
        System.out.println(user02.getInformation());

    }
}
