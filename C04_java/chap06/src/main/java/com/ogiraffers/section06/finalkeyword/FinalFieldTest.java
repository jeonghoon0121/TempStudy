package com.ogiraffers.section06.finalkeyword;

public class FinalFieldTest {
    //선언과 동시에 초기화
    //생성자를 이용해 초기화
    private final int NON_STATIC_NUM=1;
    //private final String NON_STATIC_NAME;

    public FinalFieldTest(String nonStaticName){
        //this.NON_STATIC_NAME=nonStaticName;
    }

    private static final int STATIC_NUM=1;
   private static final double STATIC_DOUBLE;
    public FinalFieldTest(double staticDouble){
        //생성자로 초기화가 불가능함
    }
    static{
        STATIC_DOUBLE=0.5;
    }
}
