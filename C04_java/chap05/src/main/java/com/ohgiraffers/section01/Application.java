package com.ohgiraffers.section01;

public class Application {
    public static void main(String[] args) {
        /*배열 연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도
        *
        * 1. 연속된 메모리 공간으로 관리 가능
        * 2. 반복문 이용 가능 */
        int num1=10;
        int num2=20;
        int num3=30;
        int num4=40;
        int num5=50;


        int[] arr1 = new int[5];
        arr1[0]=10;
        arr1[1]=20;
        arr1[2]=30;
        arr1[3]=40;
        arr1[4]=50;

        /*인덱스를 톨해 접근가능*/
        /*반복문을 통해 접근가능*/

        for(int i=0, value=0; i< arr1.length;i++){
            arr1[i]=value+=10;
        }

        int sum=0;

        sum+=arr1[0];
        sum+=arr1[1];
        sum+=arr1[2];
        sum+=arr1[3];
        sum+=arr1[4];
        System.out.println("sum="+sum);

    }

}
