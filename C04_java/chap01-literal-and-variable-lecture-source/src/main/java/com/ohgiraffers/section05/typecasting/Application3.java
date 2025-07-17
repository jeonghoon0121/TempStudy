package com.ohgiraffers.section05.typecasting;

public class Application3
{
    public static void main(String[] args)
    {
        /*자동형변환과 강제형변환을 이용하여 서로 다른 자료형끼리 연산을 수행할 수 있다.*/
        int inum=10; long  lnum =100l;
        
        /*연산방법 3가지
            1.두수의 연산결과를 int형으로 변환후 int자료형변수에 리턴받음
            2.long타입을 int형으로 강제 형변환 하여 계산
            3. 결과를 큰자료형으로 받기
        * 
        * */

        int isum=(int)(inum+lnum);
        int inum2=inum+(int)lnum;

        long lsum=inum+lnum;
        
        /*주의 사항 int미만 연산의 처리 결과는 int형이다!!
        */
        byte byteNum1=1;    byte byteNum2=2;    short shortNum1=3; short shortNum2=4;

        int result1=byteNum1+byteNum2;
        int result2=byteNum1+shortNum2;
        int result3=shortNum1+byteNum2;
        int result4=shortNum1+shortNum2;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);


    }
}
