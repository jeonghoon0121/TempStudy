package com.ogiraffers.section06.singleton;

public class LazySingleton {
    private static LazySingleton lazy;
    //클래스가 초기화 되는 시점에서 정적필드로 선언해두고 null로 초기화됨
    private LazySingleton() {}

    public static LazySingleton getInstance(){
        if(lazy==null)
            lazy=new LazySingleton();

        return lazy;

    }
}
