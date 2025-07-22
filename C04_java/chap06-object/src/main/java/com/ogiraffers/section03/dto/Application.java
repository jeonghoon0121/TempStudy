package com.ogiraffers.section03.dto;

public class Application {
    public static void main(String[] args) {
        /*데이터추상화*/

        MemberDTO memberDto = new MemberDTO();
        memberDto.setAge(20);
        memberDto.setName("홍길동");
        memberDto.setNumber(1);
        memberDto.setGender('남');
        memberDto.setHeight(180);
        memberDto.setWeight(80);
        memberDto.setActivated(true);



        System.out.println(memberDto.getAge());
        System.out.println(memberDto.getName());
        System.out.println(memberDto.getNumber());
        System.out.println(memberDto.getGender());
        System.out.println(memberDto.getHeight());
        System.out.println(memberDto.getWeight());
        System.out.println(memberDto.isActivated());
        System.out.println("test");
    }
}
