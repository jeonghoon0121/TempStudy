package com.ogiraffers.section01.section02.uses;

public class MemberFinder {
    public Member[] findAllMembers(){
        return MemberRepository.findAllMembers();
    }
}
