package cod.pra;

import java.util.Scanner;

public class pra4 {
    public void prac4(){
        /*
        1부터 입력 받은 정수까지의 짝수의 합을 출력하세요.

        -- 입력 예시 --
        정수를 입력하세요 : 10

        -- 출력 예시 --
        1부터 10까지 짝수의 합 : 30
         */
        int inputNum=0;
        int i=0;
        int total=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        inputNum=sc.nextInt();

        for(i=1;i<=inputNum;i++){
//            System.out.println(i);
            if((i%2)==0){
                total+=i;System.out.println("t"+total);
            }
            else{
            }
        }
        System.out.println("1부터"+inputNum+"까지 짝수의 합 :"+total);

        System.out.println(2+4+6+8+10);

    }
}
