package com.ogiraffers.section02.encapsulation.prob1;

public class Monster {
    String name;
    int hp;
    public void setHp(int hp){
        if(hp>0) {
            this.hp=hp;
            System.out.println("입력값으로 hp");
        }
        else{
            System.out.println("0보다 작은경우");
            this.hp=0;
        }
    }
}
