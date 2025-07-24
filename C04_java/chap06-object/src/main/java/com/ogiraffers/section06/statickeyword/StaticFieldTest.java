package com.ogiraffers.section06.statickeyword;

public class StaticFieldTest {
    private int nonStaticCount;
    private static int staticCount;
    public StaticFieldTest(){}

    public int getNonStaticCount(){
        return nonStaticCount;
    }
    public int getStaticCount(){
        return StaticFieldTest.staticCount;
    }
    //static 필드에 접근하기 위해서 클래스명,필드명으로 접근
    //this. 로도 접근 가능
    //this.을 사용하지 않는것이 좋다.

    public void increaseNonstaticCount(){
        nonStaticCount++;
    }
    public void increaseStaticCount(){
        StaticFieldTest.staticCount++;
    }
}
