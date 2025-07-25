package com.ohgiraffers.section01;

public class Application3 {
    public static void main(String[] args) {
        int[] iArr= new int[5];

        System.out.println(iArr[0]);
        System.out.println(iArr[1]);
        System.out.println(iArr[2]);
        System.out.println(iArr[3]);
        System.out.println(iArr[4]);

        for(int i=0; i<iArr.length; i++)
            System.out.println(iArr[i]);

        int[] iarr2={11,22,33,44,55};
        //블럭으로 사용할경우 new를 생략가능하다.
        int[] iarr3=new int[]{11,22,33,44,55};

        System.out.println(iarr2.length);
        System.out.println(iarr3.length);

        for(int i=0;i<iarr2.length;i++) {
            System.out.println(iarr2[i]);
        }

        String[] sarr={"apple","banana","grape","orange"};

        for(int i=0;i<sarr.length;i++){
            System.out.println(sarr[i]);
        }
    }
}
