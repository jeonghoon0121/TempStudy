import java.util.Scanner;


public class pra7
{
    /*

    월급여액,월매출액 입력
    총급여, 보너스 보너스율,

       열심히 일한 판다가 급여를 계산해 보려고 합니다.
        월 급여액과 월 매출액을 입력받아 급여를 산정합니다.
        축제 운영 사원은 매출액 대비 보너스율에 명시된 보너스를, 급여 외에 추가로 지급받습니다.

        단, 보너스율은 입력 받은 월 매출액에 비례하며,
        계산된 보너스 금액을 월 급여액에 더하여 총 급여를 계산합니다.

        보너스율을 적용하여 출력 예시처럼 출력되도록 프로그램을 만들어 보세요.

        -- 총 급여 계산식 --
        총 급여 = 월 급여  + (매출액 * 보너스율)

        -- 매출액 대비 보너스율 --
          매출액       보너스율
        5천만원 이상      5%
        3천만원 이상      3%

        1천만원 이상      1%
        1천만원 미만      0%

        -- 입력 예시 --
        월 급여 입력 : 3000000
        매출액 입력 : 20000000

        -- 출력 예시 --
        ======================
        매출액 : 20000000
        보너스율 : 1%
        월 급여 : 3000000
        보너스 금액 : 200000
        ======================
        총 급여 : 3200000
        
        
        
        100 5000만
        100 6000만
        100 2000만
        100 500만
    */
    public void prac7()
    {
        int mon1;  //월급여액
        int mon2;  //월 매출액
        int bonusper=0;   //보너스율
        double bonus; //보너스
        double total; //총급여

        Scanner scn7=new Scanner(System.in);
        System.out.print("월 급여 입력 : ");  mon1=scn7.nextInt();
        System.out.print("매출액 입력 : ");  mon2=scn7.nextInt();

        if(mon2>50000000) {bonusper=5;}
        else if(mon2>30000000) {bonusper=3;}
        else if(mon2>10000000) {bonusper=1;}
        else if(mon2<=10000000) {bonusper=0;}
        else System.out.println("error");
        bonus=mon2*bonusper*0.01;
        total=mon1+bonus;
        System.out.println("======================");
        System.out.println("매출액 : "+mon2);
        System.out.println("보너스율 :"+bonusper);
        System.out.println("월 급여 : "+mon1);
        System.out.println("보너스 금액 : "+(int)(bonus));
        System.out.println("======================");
        System.out.println("총 급여 : "+(int)(total));







    }
}
