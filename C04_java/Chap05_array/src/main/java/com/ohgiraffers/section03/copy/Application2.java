package com.ohgiraffers.section03.copy;

public class Application2 {
    public static void main(String[] args) {
        //배열을 매개변수로 이용
        //인자로 사용 또는 리턴값으로 줄때
        String[] names={"홍길동","유관순","이순신"};
        System.out.println("names의 해쉬코드"+names.hashCode());
        arrayPrint(names);

        String[] animals=getAnimals();
        System.out.println("리턴 해쉬코드:"+animals.hashCode());
        arrayPrint(animals);
    }
    public static void arrayPrint(String[] sarr){
        //전달받은 배열의 해시코드 전달
        System.out.println("hashcode"+sarr.hashCode());
        for(int i=0;i<sarr.length;i++){
            System.out.println(sarr[i]);
        }
        System.out.println();
    }
    public static String[] getAnimals(){
        String[] animals=new String[]{"낙타","호랑이","나무늘보"};
        return animals;
    }
}
