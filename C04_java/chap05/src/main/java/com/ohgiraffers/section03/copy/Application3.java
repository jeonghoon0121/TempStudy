package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {
        //깊은 복사는 heap에 새롭게 복사를 시킨다.
        //두 배열은 같은 값을 가지고 있으나 다른 배열이다.

        /*깊은 복사는 4가지가 있다.
         *1.for문
         * 2.Object clone이용
         * 3.
         * 4.
         */
        int[] originArr=new int[]{1,2,3,4,5};
        print(originArr);

        int[] copyArr1=new int[10];
        for(int i=0;i<originArr.length;i++){
            copyArr1[i]=originArr[i];
        }
        print(copyArr1);
        
        int[] copyArr2=originArr.clone();
        print(copyArr2);
        //동일 길이, 동일 값의 배열을 복사, 다른주소
        
        /*System의 arraycopy를 이용
        * 
        * */
        
        int[] copyArr3=new int[10];
        System.arraycopy(originArr,0,copyArr3,3,originArr.length);
        //인자 원본배열, 복사를 시작할 인덱스, 어떤배열에 복사를 할건지, 복사시작 인덱스, 길이
        print(copyArr3);

        int[] copyArr4= Arrays.copyOf(originArr,7);
        print(copyArr4);
    }
    public static void print(int[] iarr){
        System.out.println("iarr의 해쉬코드 :"+iarr.hashCode());
        for(int i=0;i<iarr.length;i++){
            System.out.println(iarr[i]+" ");
        }
        System.out.println();
    }
}
