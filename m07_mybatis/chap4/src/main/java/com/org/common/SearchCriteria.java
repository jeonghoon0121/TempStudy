package com.org.common;

import java.util.Scanner;

public class SearchCriteria {
    private  String condition;
   private  String value;

   public SearchCriteria(){}

    public SearchCriteria(String condition, String value) {
        this.condition = condition;
        this.value = value;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SearchCriteria{" +
                "condition='" + condition + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public static SearchCriteria inputSearchCriteria(){
        Scanner sc=new Scanner(System.in);
        System.out.print("검색기준을 입력하세요(name or category)");
        String condition=sc.nextLine();
        System.out.println("검색어를 입력해주세요.");
        String value=sc.nextLine();

        return new SearchCriteria(condition, value);
    }
}
