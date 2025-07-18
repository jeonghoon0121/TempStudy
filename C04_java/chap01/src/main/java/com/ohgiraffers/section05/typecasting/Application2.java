package com.ohgiraffers.section05.typecasting;

public class Application2 
{
    public static void main(String[] args) 
    {
        /*강제형변환
        *
        * (바꿀자료형)값;
        *
        *   자동형변환의 규칙에서 반대상황의경우
        *       1-1큰자료형에서 작은자료형
        *       1-2실수에서 정수로

        *       1-3문자형을 int미만, byte나 short일 경우
        *       1-4 shsflguddms wpdhlehlsek.
        *
        *           1-1-1정수끼리 강제형변환
        * */
                long    lnum=8L;
        //int inum=lnum;  //데이터 손실 가능성을 컴파일러가 알려줌

        int inum=(int)lnum;    //강제형변환 필요

        short snum=(short)inum;
        byte bnum=(byte)snum;

        /**/

        double dnum=8.0;
        //float fnum =dnum;
        float fnum=(float)dnum;
        System.out.println(fnum);

        float fnum2=4.0f;
        // long lnum2=fnum2;    //소수점 자리 이하 데이터손실 가능성
        long lnum2=(long) fnum2;

        /*문자형을 int미만 크기의 변수에 저장할 때*/

        char ch='a';byte bnum2=(byte)ch;
        short snum2=(short)ch;

        /*char는 부호비트가 없으므로 조금더 short보다 넓은느낌으로 쓸수 있다.*/

        int num1=97;
        int num2=-97;

        char ch2=(char) num1;
        char ch3=(char) num2;
        System.out.println(ch2);
        System.out.println(ch3);    //unicode 출력
        
        /*강제형변환은 규칙에서도 제외됨*/
        boolean isTrue=true;
        //byte b =(byte)isTrue;

    }
}
