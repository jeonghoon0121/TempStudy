package ohgiraffers.section01.extend;

public class Application {
    public static void main(String[] args) {
        Car car=new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();

        car.stop();
        car.soundHorn();
        FireCar firecar=new FireCar();
        firecar.soundHorn();

        firecar.soundHorn();
        firecar.run();
        firecar.soundHorn();
        firecar.stop();
        firecar.soundHorn();

//        firecar.runningStatus
        RacingCar racingCar=new RacingCar();
        racingCar.soundHorn();
        racingCar.run();
    }

}
