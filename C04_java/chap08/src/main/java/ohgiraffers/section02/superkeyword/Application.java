package ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Application {
    /*super 자식 클래스를 이용해서 객체를 생성할때 부모생성자를 호출하여
    부모클래ㅔ스의 인스턴스도 함께 생성이 된다.
    이때
    *
    * */


    public static void main(String[] args) {
        Product pro1 = new Product();
        Product pro2 = new Product("a", "b", "a", 1000, new Date());
        System.out.println(pro1.getCode());
        System.out.println(pro2.getCode());
    }
}
