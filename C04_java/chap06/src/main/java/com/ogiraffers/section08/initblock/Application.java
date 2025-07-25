package com.ogiraffers.section08.initblock;

public class Application {
    public static void main(String[] args) {
        //초기화블럭의 동작순서를 이해
        /*복잡한 초기화를 수행가능한 블럭제공
        * */
        Product product=new Product();
        System.out.println(product.getInformation());

        Product product1=new Product();
    }

}
