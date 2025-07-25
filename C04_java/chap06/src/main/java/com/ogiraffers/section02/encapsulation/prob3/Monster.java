package com.ogiraffers.section02.encapsulation.prob3;

public class Monster{
    private String kinds;
    private int hp;

    public void setKinds(String kinds){
        this.kinds=kinds;
    }
    public void setHp(int hp){
        if(hp>0){
            this.hp=hp;
        }
        else{
            this.hp=0;
        }

    }
    public String getInfo(){
        return "몬스터 종류는 "+this.kinds+"체력은"+this.hp;
    }
}
