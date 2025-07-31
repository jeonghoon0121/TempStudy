package com.ohgiraffers.practice02;

public class SimpleOperations {
    public void printMessage() {
        System.out.println("메소드 호출 확인");
    }
    public int sumNumbers(int start, int end){
        int sum=0;
        for(;start<=end;start++){
            sum+=start;
        }
        return sum;
    }
    public boolean isEvenNumber(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public int countCharacter(String input, char ch){
        int countNumber=0;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)==ch)
            {
                countNumber++;
            }
            else{

            }
        }

        return countNumber;
    }
    public String reverseString(String input){
        String changeString = "";
        for(int i = 0; i < input.length(); i++){
            changeString = changeString + input.charAt(input.length() - 1 - i);
            System.out.println(changeString);
        }
        return changeString;
    }

}
