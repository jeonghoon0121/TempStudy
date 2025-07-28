import java.util.Scanner;

public class pra3
{
    public void prac3()
    {
        /*
        정수형 변수를 두개 선언하여 회원의 월(month)과 일(day)를 저장합니다.
        월이 1월부터 6월까지이면서, 일이 1일부터 15일까지인 경우 “배민 쿠폰”을,
        월이 7월부터 12월까지이면서, 일이 16일부터 31일까지인 경우 “스타벅스 커피”를
        그 외의 경우는 “사탕”이 선물로 선택되는 프로그램을 작성하세요.

        -- 출력예시 --
        “본인이름”의 선물은 스타벅스 커피 입니다.

        또는 “본인이름”의 선물은 사탕 입니다.

        또는 “본인이름”의 선물은 배민 쿠폰 입니다.

        1월 1일 이이 1월 16일 이이
        7월 1일 이이 7월 15일 이이
        13월 32일 이이
        */
        Scanner sc3=new Scanner(System.in);
        int mon,day=0;  String gift1="";    String name="";
        System.out.println("월입력");  mon=sc3.nextInt();
        System.out.println("일입력");  day=sc3.nextInt();
        System.out.println("이름입력");
        sc3.nextLine();//1번더 넣어야 버퍼가 사라짐
        name=sc3.nextLine();
        if((mon>=1)&&(mon<=6)){if((day>=1)&&(day<=15))gift1="배민 쿠폰";if((day>=16)&&(day<=31))gift1="사탕";}
        else if((mon>=7)&&(mon<=12)){if((day>=16)&&(day<=31))gift1="스타벅스 커피";if((day>=1)&&(day<=15))gift1="사탕";}
        else{
            System.out.println("error");
        }
        System.out.println(name+"의 선물은 "+gift1+"입니다.");

    }
}
