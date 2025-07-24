package com.ogiraffers.section06.singleton;

public class EagerSingleton {
    private static EagerSingleton eager=new EagerSingleton();
    //싱글톤 패턴은 생성자 호출을 통해 외부에서 인스턴스를 생성하는 것을 제한한다.
    private EagerSingleton(){}
    public static EagerSingleton getInstance(){
        return eager;
    }
}
