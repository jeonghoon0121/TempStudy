package com.ohgiraffers.practice01;

public class Calculator {
    /*+ checkMethod():void                    // 함수 호출 확인용 메소드
        + sum1to10():int                        // 1부터 10까지 수를 더하여 값을 리턴함
        + checkMaxNumber(a:int, b:int):void     // 두 수를 입력받아 큰 수를 출력함
        + sumTwoNumber(a:int, b:int):int        // 두 수를 입력받아 합을 리턴함
        + minusTwoNumber(a:int, b:int):int      // 두 수를 입력받아 차를 리턴함

    **/
    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }
    public int sum1to10(){
        int sum=0;
        for(int i=1;i<=10;i++){
            sum+=i;
        }

        return sum;
    }
    public void checkMaxNumber(int a,int b){
        int bigNumber=0;
        if(a>b)
            bigNumber=a;
        else
            bigNumber=b;

        System.out.println("두 수 중 큰 수는 "+bigNumber+"이다");
    }
    public int sumTwoNumber (int a,int b) {
        return a+b;
    }
    public int minusTwoNumber(int a,int b){
        if(a>b)
            a-=b;
        else{
            a=b-a;
        }
        return (a);
    }



}
