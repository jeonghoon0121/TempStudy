package ohgiraffers.section02.superkeyword;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class Product {
    private String code;
    private String brand;
    private String name;
    private int priced;
    private java.util.Date manuFactureingDate;

    public Product() {
        System.out.println("기본생성자");
    }

    public Product(String code, String brand, String name, int priced, java.util.Date manuFactureingDate) {
        this.code=code;
        this.brand=brand;
        this.name=name;
        this.priced=priced;
        this.manuFactureingDate=manuFactureingDate;
    }


    public void setCode(String code) {
        this.code = code;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriced(int priced) {
        this.priced = priced;
    }

    public void setDate(java.util.Date manuFactureingDate) {
        this.manuFactureingDate = manuFactureingDate;
    }

    public String getCode() {
        return code;
    }
    public String getBrand(){
        return brand;
    }
    public String getName(){
        return name;
    }
    public int getPriced(){
        return priced;
    }
    public java.util.Date getDate(){
        return manuFactureingDate;
    }


}

