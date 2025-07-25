package com.ohgiraffers.section02.demensional;

public class Application {
    public static void main(String[] args) {
        //2차원 배열은 1차원 배열 여러개를 하나로 묶어서 관리하는 배열을 의미
        
        int[][] iarr1;
        int iarr2[][];
        int []iarr3[];
        
//        iarr1=new int[][];    //크기를 지정하지 않으면 에러남
////        iarr1= new int[][4];  //못씀, 주소를 묶어서 관리할 배열의 크기를 지정하지  않으면 에러
        iarr1=new int[3][];

        iarr1[0]=new int[5];
        iarr1[1]=new int[5];
        iarr1[2]=new int[5];

        iarr2=new int[3][5];

        //앞부분은 주소를 관리하는 배열의 크기, 뒷부분은 각 인덱스를 할당하는 배열의 길이
    
        for(int i=0;i<iarr1.length;i++)
            System.out.println(iarr1[0][i]+" ");
        System.out.println();
        for(int i=0;i<iarr1.length;i++)
            System.out.println(iarr1[1][i]+" ");

        for(int i=0;i<iarr1.length;i++)
            System.out.println(iarr1[2][i]+" ");
    
    }
}
