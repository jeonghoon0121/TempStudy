package com.ogiraffers.section05.parameter;

public class Parametertest {
    public void testPrimaryTypeParameter(int num){
        System.out.println("매개변수로 전달받은값"+num);
    }
    public void testPrimaryTypeArrayParameter(int[] iarr){
        System.out.println("매개변수로 전달받은 값"+iarr);

        System.out.println("배열값 출력");
        for(int i=0;i<iarr.length;i++){
            System.out.println(iarr[i]+" ");
        }
        System.out.println();
        iarr[0]=99;
        System.out.println("변경후 배열의 값 출력");
        for(int i=0;i<iarr.length;i++){
            System.out.println(iarr[i]+" ");
        }
        System.out.println();
    }
    public void testClassTypeParameter(RectAngle rectAngle){
        System.out.println("매개변수로 받은 값"+rectAngle);
        rectAngle.calcArea();
        rectAngle.calcRound();

        rectAngle.setWidth(100);
        rectAngle.setHeight(100);

        rectAngle.calcArea();
        rectAngle.calcRound();

    }
    public void testVariableLengthArrayParameter(String name, String... hobby){
        System.out.println("이름개수"+name);
        System.out.println("취미개수"+hobby.length);
        System.out.println("취미:");
        for(int i=0;i<hobby.length;i++){
            System.out.println(hobby[i]+" ");
        }
        System.out.println();
    }
}
