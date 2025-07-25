package com.ogiraffers.section06.statickeyword;

public class StaticMethodTest {
    private int count;
    public void nonStaticMethod(){
        this.count++;   //인스턴스로 생성후 사용가능한 메소드라서 this에는 주소가 있음
        System.out.println("nonStaticMethod 호출됨");
    }
    public static void staticMethod(){
        //this.cunt++; //인스턴스를 생성하지 않고 사용하는 메소드이기때문에 this에는 주소가들어갈 수 없다. 
        System.out.println("staticMethod 호출됨");
    }

}
