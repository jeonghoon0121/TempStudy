package com.ohgiraffers.section03.math;

public class Application2
{
    public static void main(String[] args)
    {
        //Math.random()을 이용해 발생한 난수
        //0~1전까지의 실수범위  난수값
        //필요에 따라 정수형태의 값을 원하는 만큼
        //발생시켜야 하는 경우들이 존재
        //원하는 범위의 난수구하는 공식
        //(int)(Math.random()*난수개수)구하려는 난수최소값
        //0~9까지 난수발생
        int random1=(int)(Math.random()*10)+0;
        System.out.println(random1);

        int random2=(int)(Math.random()*10)+1;
        System.out.println(random2);

        //10~15
        int random3=(int)(Math.random()*5)+10;
        int random4=(int)(Math.random()*256)-128;
        System.out.println(random3);
        System.out.println(random4);
    }
}
