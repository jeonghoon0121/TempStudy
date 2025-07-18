package com.ohgiraffers.section05.typecasting;

public class Application1
{
    public static void main(String[] args)
    {
        /*자동 형변환 규칙에 대해 이해가능
        * 
        * 다른 타입의 경우는 불가능함
        * */    
        
        /*
            1.자동형변환 묵시적 컴파일러가 바꿈
                1-1 작은자료형에서 큰자료형 ,데이터손실 일어나지않음
                1-2 정수-> 실수형
                1-3 문자형-> int형
                1-4 논리형은 제외
            2.강제형변환 명시적 사람이 바꿈 cast연산자 이용
                2-1 자동형변환이 일어나지 않는 경우
                2-2
        */
        /*자동형변환 test* 1-1,정수형 */
        byte bnum=1; short snum=bnum; int inum=snum; long lnum=inum;

        int num1=10; long num2=20;
        //int result1=num1+num2;  //error: incompatible types: possible lossy conversion from long to int
        long result1=num1+num2;
        //용량이 적은곳에서 큰곳으로 이동할때만 자동형변환이 일어남
        System.out.println(result1);
        /*자동형변환 test* 1-1,실수형 */

        float fnum=4.0f; double dnum=fnum;
        double result2=fnum+dnum;
        System.out.println(result2);

        /*정수는 실수로 자동형변환*/
        long eight=8L;
        float four=eight;

        System.out.println(four);
        /*데이터 손실이 없어서 가능하다*/

        float result3=eight+four;
        System.out.println(result3);
        /*문자형은 int형으로 자동변환된다. */

        char ch1='a' ;
    int charNumber=ch1;
        System.out.println(charNumber);

        /*논리형은 형변환 규칙에서 제외*/

        boolean isTrue =true;
        /*어떤 자료형이든 boolean을 형변환 할 수는 없다. */


    }
}
