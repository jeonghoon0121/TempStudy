package com.checkMemory;

public class checkMemory  {
    public static void main(String[] args) {

        System.out.println("KB: " + (double) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024);

    }
}

