package com.org.practice;

public class Drink {
    private boolean isOn=false; //돈이 없는 상태
    private String drinkName;
    public Drink(){
    }
    public Drink(String drinkName){
        this.drinkName=drinkName;
    }
    public void payMoney(){
        if(this.isOn==true){
            System.out.println("(자판기)이미 돈이 있습니다.");
        }
        else{
            this.isOn=true;
            System.out.println("(자판기)돈을 넣었습니다.");
        }
    }
    public void pushButton(){
        if(this.isOn==true){
            System.out.println("(자판기)음료수가 나왔습니다.");
//            System.out.println(drinkName+"입니다. ");
            System.out.println("(자판기)음료수를 마십니다. ");
            this.isOn=false;
        }
        else{
            System.out.println("(자판기)돈을 넣어주세요.");
        }
    }

}
