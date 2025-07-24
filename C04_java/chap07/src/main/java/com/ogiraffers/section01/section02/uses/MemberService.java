package com.ogiraffers.section01.section02.uses;

public class MemberService {
    //회원가입 기능
    public void signupMemberS(){
    Member[] members=new Member[5];
    members[0]=new Member(1,"user01","pass01","홍길동",20,'남');
    members[1]=new Member(2,"user02","pass02","이순신",40,'남');
    members[2]=new Member(3,"user03","pass03","유관순",30,'여');
    members[3]=new Member(4,"user04","pass04","신사임당",15,'여');
    members[4]=new Member(5,"user05","pass05","윤봉길",22,'남');

//    members[10]=new Member(5,"user05","pass05","윤봉길",22,'남');





        MemberRegister memberRegister=new MemberRegister();
    memberRegister.regist(members);

    }


    //전체회원조회기능
    public void showAllMembers(){
     MemberFinder memberFinder = new MemberFinder();
        System.out.println("가입회원 목록");
        for(Member member : memberFinder.findAllMembers()){
            if(member!=null){
                System.out.println(member.getInformation());
            }
        }
        System.out.println("------------------------------");
    }
}
