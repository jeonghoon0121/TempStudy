package com.ogiraffers.section08.initblock;


public class Product {
    private String name;
    private int price;
    private static String brand;
    {
        name="사이언";
        price=9000000;
        brand="사과:";
        System.out.println("인스턴스 작동");
    }
    static{

    }

    public String getInformation(){
        return "Product[name="+this.name+", price="+this.price+", brand="+Product.brand+"]";
    }


}
