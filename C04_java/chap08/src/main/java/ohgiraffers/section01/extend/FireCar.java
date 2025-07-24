package ohgiraffers.section01.extend;

public class FireCar extends Car{
    public FireCar() {
        super();//부모생성자
        System.out.println("FireCar 클래스의 기본 생성자 호출됨");
    }
    //annotation 오버라이딩 성립조건이 되는지
    //성립되지않는경우 컴파일에러 발생
    @Override
    public void soundHorn(){
        if(isRunning()){
            System.out.println("빠아아아아아아아앙아ㅏ아아");
        } else{
            System.out.println("소방차가 앞으로 갈 수 없다. 비키세요");
        }
    }
    public void sprayWater(){
        System.out.println("불난곳을 찾았습니다. 물을 뿌립니다. ");
    }
}
