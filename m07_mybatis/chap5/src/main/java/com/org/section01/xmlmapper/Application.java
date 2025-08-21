package com.org.section01.xmlmapper;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
//        System.out.println(getSqlSession());
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("매퍼 element테스트 메뉴");
            System.out.println("1. <resultMap>");
            System.out.println("2. <sql> ");
            System.out.println("메뉴번호 입력");
            int no=sc.nextInt();
            switch (no){
                case 1:resultMapSubMenu(); break;
                case 2:
            }
        }while (true);
    }
    private static void resultMapSubMenu() {
        Scanner sc=new Scanner(System.in);
        ElementTestService elementTestService=new ElementTestService();
        do{
            System.out.println("<resultMap> 서브메노");
            System.out.println("1. <resultMap> 테스트");
            System.out.println("2. <constructor> 테스트");
            System.out.println("3. <association> 테스트");
            System.out.println("4. <collection> 테스트");
            System.out.println("메뉴 번호를 입력하세요.");
            int no=sc.nextInt();
            switch (no){
                case 1: elementTestService.selectResultMapTest();
                case 2: elementTestService.selectResultMapConstructorTest();
                case 3: elementTestService.selectResultMapAssociationTest();
                case 4:
            }
        }while(true);
    }
}
