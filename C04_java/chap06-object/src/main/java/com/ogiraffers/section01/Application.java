package com.ogiraffers.section01;

public class Application {
    public static void main(String[] args) {
        String id="user01";
        String pwd="pass01";
        String name="홍길동";
        int age=20;
        char gender='남';
        String[] hobby={"축구","볼링","테니스"};

        System.out.println("id="+id);
        System.out.println("pwd="+pwd);
        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.println("gender"+gender);
        for(int i=0;i<hobby.length;i++)
            System.out.println(hobby[i]+" ");
        System.out.println();

        //사용자  정의의 자료형 사용하기

        Member memberInstanse =new Member();
        System.out.println(memberInstanse.id);
        System.out.println(memberInstanse.pwd);
        System.out.println(memberInstanse.age);
        System.out.println(memberInstanse.gender);
        System.out.println(memberInstanse.hobby);

        //값이 null인 경우는 초기화가 안되었으니 주소를 따라가면 값이 없다.
          memberInstanse.id="user01";
          memberInstanse.pwd="pass01";
          memberInstanse.name="유관순";
          memberInstanse.age=20;
          memberInstanse.gender='남';
          memberInstanse.hobby = new String[]{"축구","볼링","테니스"};

        System.out.println(memberInstanse.id);
        System.out.println(memberInstanse.pwd);
        System.out.println(memberInstanse.age);
        System.out.println(memberInstanse.gender);
        for(int i=0;i<memberInstanse.hobby.length;i++)
            System.out.println(memberInstanse.hobby[i]);



    }

}
