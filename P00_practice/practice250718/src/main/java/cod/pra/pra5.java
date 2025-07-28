package cod.pra;

import java.util.Scanner;

public class pra5 {

    /*5.

        문자열을 입력 받아서 문자열의 각 인덱스별로 한 글자씩 출력하세요.

        -- 입력 예시 --
        문자열을 입력하세요 : apple

        -- 출력 예시 --
        0 : a
        1 : p
        2 : p
        3 : l
        4 : e
    */
    public void prac5(){
        Scanner sc= new Scanner(System.in);
        String inputString;

        System.out.print("문자열입력 :");
        inputString=sc.nextLine();

        char[]mun=inputString.toCharArray();    //String을 char[]로 변경
//        System.out.println("start");
        for(int i=0; i<mun.length; i++)
        {
            System.out.println(i+":"+mun[i]);
        }

    }
}
