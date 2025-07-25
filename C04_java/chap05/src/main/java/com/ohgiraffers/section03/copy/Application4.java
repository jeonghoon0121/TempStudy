package com.ohgiraffers.section03.copy;

public class Application4 {
    public static void main(String[] args) {
        //깊은 복사된 배열의 값변경

        int[] arr1={1,2,3,4,5};
        int[] arr2=arr1.clone();

        System.out.println(arr1.hashCode());
        System.out.println(arr2.hashCode());

        for(int i=0;i<arr1.length;i++)
            arr1[i]=+10;

        for(int i=0;i<arr1.length;i++)
            System.out.println(arr1[i]);


        for(int i=0;i<arr2.length;i++)
            System.out.println(arr2[i]);

        for(int i:arr2){
            System.out.println(i+" ");
        }

    }

}
