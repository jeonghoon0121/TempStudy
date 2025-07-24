package com.ogiraffers.section05.parameter;

public class Application {
    public static void main(String[] args) {
        Parametertest pt=new Parametertest();
        int num=20;
        pt.testPrimaryTypeParameter(num);
        int[] iarr=new int[]{1,2,3,4,5};
        System.out.println("인자로 전달받은 값"+iarr);
        pt.testPrimaryTypeArrayParameter(iarr);

        System.out.println("변경후 원본 배열의 값 출력");
        for(int i=0;i<iarr.length;i++){
            System.out.println(iarr[i]+" ");
        }
        System.out.println();

        RectAngle r1= new RectAngle(12.5,22.5);
        System.out.println("인자로 전달받은 깂"+r1);

        System.out.println("변경후 사각형 넓이와 둘레");
        r1.calcRound();
        r1.calcArea();

        pt.testVariableLengthArrayParameter("홍길동");
        pt.testVariableLengthArrayParameter("유관순","볼링");
        pt.testVariableLengthArrayParameter("이순신","볼링","테니스","당구");
        pt.testVariableLengthArrayParameter("신사임당", new String[]{"테니스", "성예", "떡썰기"});

    }
    

}
