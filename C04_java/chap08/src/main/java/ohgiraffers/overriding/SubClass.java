package ohgiraffers.overriding;

public class SubClass {

//    public void method2(int num){}
    //메소드 읾이 동일하지 않음
    
    //@Override
//    public int method(int num){}
    //메소드 리턴타입 다르면 에러
    
//    @Override
//    public void method(String num){}
    //매개변수 갯수나 타입이 변경되면 에러발생
    
    //메소드 이름, 리턴타입, 매개변수 개수 순서 일치
//    @Override
    public void method(int num){}

    //private는 메소드 오버라이딩 불가
//    @Override
//    public final void finalMethod(){}

    //
}
