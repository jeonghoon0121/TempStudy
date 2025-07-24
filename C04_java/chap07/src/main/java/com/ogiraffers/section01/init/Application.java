package com.ogiraffers.section01.init;

public class Application {
    public static void main(String[] args) {
        Car car1=new Car("페라리1",300);
        Car car2=new Car("페라리2",200);
        Car car3=new Car("페라리3",150);
        Car car4=new Car("페라리4",100);
        Car car5=new Car("페라리5",300);

        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        car4.driveMaxSpeed();
        car5.driveMaxSpeed();

        Car[] carArray=new Car[5];
        carArray[0]=new Car("페라리1", 200);
        carArray[0]=new Car("페라리2", 100);
        carArray[0]=new Car("페라리3", 350);
        carArray[0]=new Car("페라리4", 350);
        carArray[0]=new Car("페라리5", 500);
        for(int i=0;i<carArray.length;i++){
            carArray[i].driveMaxSpeed();
        }
        Car[] carArray2= {
                carArray[0] = new Car("페라리1", 200),
                carArray[0] = new Car("페라리2", 100),
                carArray[0] = new Car("페라리3", 350),
                carArray[0] = new Car("페라리4", 350),
                carArray[0] = new Car("페라리5", 500)
        };
        for(Car c:carArray2){
            c.driveMaxSpeed();
        }


    }
}
