package com.ogiraffers.section01.section02.uses;

public class MemberRegister {
    public void regist(Member[] members){
        System.out.println("회원등록");
        for(int i=0;i<members.length;i++){
            System.out.println(members[i].getName()+"님을 회원 등록에 성공했다. ");
        }
        if(MemberRepository.store(members)){
            System.out.println("총"+members.length+"명이 등록에 성공했습니다. ");
        }
    }

}
