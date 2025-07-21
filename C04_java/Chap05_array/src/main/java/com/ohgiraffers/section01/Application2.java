package com.ohgiraffers.section01;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        int[] iarr; //레퍼런스 변수라고도함, 주소값, 배열의 참조형 변수 f
        char carr[];

//        iarr=new int[]; 크기가 없을 시에 에러난다.
        iarr = new int[5];
        carr=new char[10];

        int[]iarr2 = new int[5];
        char carr2[]=new char[10];

        System.out.println(iarr2);//16진수로 나옴
        System.out.println(carr2);

        System.out.println(iarr2.hashCode());
        System.out.println(carr2.hashCode());
        
        //객체의 주소값을 10진수로 변환해 생성한 객체의 공유한 정수값을 반환
        //동일 객체인지 비교하여 사용할 목적
        //hashCode()
        //length 배열의 길이를 알 수 있다.

        System.out.println(iarr2.length);
        System.out.println(carr2.length);

        //length의 프로퍼티를 이용 

        Scanner sc=new Scanner(System.in);
        System.out.println("새로 할당할 배열의 길이를 입력하세요");

        int size=sc.nextInt();

        double[] darr= new double [size];

        //배열의 킈기를 입력받아 하랑
        System.out.println(darr.hashCode());
        System.out.println(darr.length);

        darr=new double[30];
        System.out.println(darr.hashCode());
        System.out.println(darr.length);

        darr=null;
//        System.out.println(darr.length);
    }

}
