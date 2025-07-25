package com.ohgiraffers.section03.copy;

public class Application {
    public static void main(String[] args) {
        int[] originArr={1,2,3,4,5};

        int[] copyArr=originArr;
        System.out.println(originArr.hashCode());
        System.out.println(copyArr.hashCode());

        for(int i=0;i<originArr.length; i++){
            System.out.println(originArr[i]+" ");
        }

        for(int i=0;i<copyArr.length; i++){
            System.out.println(copyArr[i]+" ");
        }

        copyArr[0]=99;
    }

}
