package com.ohgiraffers.practice02;

public class Application {
    public static void main(String[] args) {
        int start=1; int end=10;    //2번
        String str="Hello World"; char charo='o';


        SimpleOperations simpleOperationsInstance =new SimpleOperations();

        simpleOperationsInstance.printMessage();
        System.out.println(start+"부터 "+end+"까지의 숫자들의 합은"+ simpleOperationsInstance.sumNumbers(start,end)+"입니다.");

        if(simpleOperationsInstance.isEvenNumber(10)){
            System.out.println("10은 짝수입니다.");
        }


        System.out.println("\""+str+"\""+"에서"+"\'"+charo +"\'"+"의 개수는 : "+simpleOperationsInstance.countCharacter(str,charo));
        System.out.println("\""+str+"\""+"를 뒤집은 결과는 : "+simpleOperationsInstance.reverseString(str));


    }
}
