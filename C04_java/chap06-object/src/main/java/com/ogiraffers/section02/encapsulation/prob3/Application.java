package com.ogiraffers.section02.encapsulation.prob3;
public class Application {
    /*접근제한자 클래스 혹은 클래스의 멤버참조연산자로 접근범위를 제안하기위함*/

    /*
    *
    * 클래스 선언시 사용하는 접근 제한자   는 public과 defalut만 사용가능 */
    public static void main(String[] args) {

        Monster mon4 =new Monster();
        mon4.setHp(100);
        mon4.setKinds("이름");
        mon4.getInfo();
    }



}
