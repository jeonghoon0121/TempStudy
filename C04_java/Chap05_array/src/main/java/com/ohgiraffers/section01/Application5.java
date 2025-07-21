package com.ohgiraffers.section01;

public class Application5 {
    public static void main(String[] args) {
        //배열 예시
        String[] shapes={"SPADE","CLOVER","HEART","DIAMOND"};
        String[] cardNumbers={"king","queen","ace","jack","2","3","4","5","6","7","8","9","10"};

        int randomShapeIndex=(int)(Math.random()* shapes.length);
        int randomCardNumbersIndex=(int)(Math.random()* cardNumbers.length);

        System.out.println("당신이 뽑은 카드는"+shapes[randomShapeIndex]+" "+cardNumbers[randomCardNumbersIndex]+"카드입니다. ");
    }
}
