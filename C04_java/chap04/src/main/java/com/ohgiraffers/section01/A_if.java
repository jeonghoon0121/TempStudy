package com.ohgiraffers.section01;

import java.util.Scanner;

public class A_if {
    public void testSimpleIfStatment(){
        System.out.println("aa");
        /*If test*/
        /*문제
        정수 1개 입력
        짝수이면 "짝수"출력
        홀수이면 끝
        종료시 "return 0"
        * */
        System.out.println("aa");
        Scanner sc=new Scanner(System.in);
        int inputNumber=0;
        inputNumber=sc.nextInt();
        if((inputNumber%2)==0){
            System.out.println("짝수");
        }
        else{
            
        }
        System.out.println("return 0");
    }
    public void testNestedIfStatement(){
        /*중첩 If test*/

    }
}
