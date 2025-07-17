import java.util.Scanner;

public class pra6
{
    public void prac6()
    {
        /*
                판다는 축제 부스에서 일한 뒤, 인사평가 점수를 받았습니다.

                성실, 서비스, 미소 점수를 입력받아
                평균 점수가 60점 이상이면서 각 항목이 40점 이상인 조건이 만족하면 "합격입니다!" 를 출력하세요,

                단, 합격이 아닌 경우 불합격 사유가 무엇인지를 모두 출력해 주어야 합니다.
                평균점수 미달인 경우 "평균점수 미달로 불합격입니다."라고 출력하고,
                항목당 과락 점수가 있는 경우 "xx 항목의 점수 미달로 불합격 입니다."를 출력하세요.

                -- 입력 예시 --
                성실 점수 : 60
                서비스 점수 : 30
                미소 점수 : 20

                -- 출력 예시 --
                평균 점수 미달로 불합격입니다.
                서비스 점수 미달로 불합격입니다.
                미소 점수 미달로 불합격입니다.
                
                성실, 서비스, 미소          
                1,평균 60이상 and 각항목 모두 40점이상    합격
                2. 불합격시 이유 출력 과목, 과락


                39 50 50
                50 39 50
                50 50 39

        */
        Scanner scn6=new Scanner(System.in);
        int hon;    //성실
        int ser;    //서비스
        int me;     //미소
        int aver;   //평균
        int total;   //총점
        System.out.println("성실점수"); hon=scn6.nextInt();
        System.out.println("서비스점수"); ser=scn6.nextInt();
        System.out.println("미소점수"); me=scn6.nextInt();
        total=hon+ser+me;
        aver=total/3;
        if(aver<60) System.out.println("평균 점수 미달로 불합격입니다.");
        if(hon<40) System.out.println("성실 점수 미달로 불합격입니다.");
        if(me<40) System.out.println("미소 점수 미달로 불합격입니다.");
        if(ser<40) System.out.println("서비스 점수 미달로 불합격입니다.");

        if((aver>=60)&&(hon>=40)&&(me>=40)&&(ser>=40))
        {
            System.out.println("합격입니다!");
        }

    }
}
