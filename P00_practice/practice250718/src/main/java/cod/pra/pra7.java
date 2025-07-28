package cod.pra;

import java.util.Scanner;

public class pra7
{
    /*
     *
     *
        정수를 입력받아 1부터 입력받은 정수까지
        홀수이면 "토", 짝수이면 "마"가 정수만큼 누적되어 출력되도록 하세요.
        홀수이면 "토", 짝수이면 "마"가 정수만큼 누적되어 출력되도록 하세요.

        -- 입력 예시 --
        정수를 입력하세요 : 5

        -- 출력 예시 --
        토마토마토
    *
    *
    * */
    public void prac7(){
        int inputnum=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("정수입력");
        inputnum=sc.nextInt();

        if(inputnum<0){
            System.out.println("음수error");
        }
        
            for(int p=1;p<=inputnum;p++)
            {
                if(p%2==0) {
                    System.out.println("마");
                }        
                else{
                    System.out.println("토");
                                        
                }
            
            }
    }
}
