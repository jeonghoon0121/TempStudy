package com.org.practice;

public class VendingMachine {
    private final Drink drink1 =new Drink();
        public VendingMachine(){

        }
        public VendingMachine(String name){
            //drink1
        }

        public void insertMoney() {
            drink1.payMoney();
        }
        public void pushButton() {
            drink1.pushButton();
        }

}
