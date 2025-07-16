package com.ohgiraffers.section05.typecasting;

public class Application4
{
    public static void main(String[] args)
    {
        /*
        * 형변환 할때의 데이터 손실 주의할점 */

        int inum=290;
        byte bnum=(byte)inum;

        System.out.println(inum);
        System.out.println(bnum);

        /*필요에따라 형변환할때, 소수점 절삭*/

        double height=175.5;
        int floorHeight=(int)height;

        System.out.println("height"+height);

        System.out.println(floorHeight);    //소수점 절삭
    }
}
