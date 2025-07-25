package com.ogiraffers.section06.singleton;


public class Application {
    public static void main(String[] args) {
        EagerSingleton eager1=EagerSingleton.getInstance();
        EagerSingleton eager2=EagerSingleton.getInstance();

        System.out.println(eager1.hashCode());
        System.out.println(eager2.hashCode());

        LazySingleton laz1=LazySingleton.getInstance();
        LazySingleton laz2=LazySingleton.getInstance();

        System.out.println(laz1.hashCode());
        System.out.println(laz2.hashCode());
    }

}
