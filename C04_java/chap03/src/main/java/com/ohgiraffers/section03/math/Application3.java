package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3
{
    public static void main(String[] args)
    {
//        java.util.random 클래스를 활용하여 난수가능
        //random.nextInt(구하려는난수갯수) + 구하려는 난수최솟값

        Random random = new Random();

        int ramdom1 = random.nextInt(10);

        int random2=random.nextInt(10)+1;
                //1~10까지 난수
    }
}
