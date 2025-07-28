package cod.pra;

import java.util.Scanner;

public class pra2 {
    public void prac2(){
        /*
        *
        * 정수 한 개를 입력 받고, 1부터 입력 받은 정수까지의 합을 계산해서 출력하세요.

            -- 입력 예시 --
            정수를 입력하세요 : 5

            -- 출력 예시 --
            * 1부터 5까지의 합 : 15
        *
        * */
        int num1=0; Scanner sc=new Scanner(System.in);
        int hap=0;
        System.out.print("정수 1개 입력 :");
        num1=sc.nextInt();


        if(num1<0){
            System.out.println("음수입력");
        }
        else{
            int i=0;
            for(i=1;i<num1;i++){
                hap+=i;
            }
            hap+=i;
        }
        System.out.println("1부터 "+num1+"까지의 합 : "+hap);
        System.out.println("return 0");
    }
}
