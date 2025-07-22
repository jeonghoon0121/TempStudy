package com.ogiraffers.section03.abstraction;

public class Car {
    private boolean isOn=false;   //false는 시동끔
    private int speed; 
    /*캡슐화로 직접 접근을 제어*/

    public void startUp(){
        if(this.isOn==true){
            System.out.println("이미 시동이 걸려 있습니다.");
        }
        else{
            this.isOn=true;
            System.out.println("시동을 걸었습니다.");
        }
    }
    public void go(){
        if(isOn==true){
            System.out.println("차가 앞으로 움직입니다.");
            this.speed+=10;
            System.out.println("현재 차의 시속은"+this.speed+"km/h입니다.");
        }
        else{
            System.out.println("시동을 걸어주세요.");
        }
    }
    public void stop(){
        if(isOn==true){
            if(this.speed>0){
                this.speed=0;
                System.out.println("브레이크를 밟아 차를 멈춥니다.");
            }
            else{
                System.out.println("차는 이미 멈추었습니다.");
            }
        }
        else{
            System.out.println("차에 시동을 걸어주세요.");
        }
    }
    public void turnOff(){
        if(isOn){
            if(speed>0){
                System.out.println("달리는 상태이니 차를 멈쳐주세요");
            }
            else{
                this.isOn=false;
                System.out.println("시동을 끕니다. ");
            }
        }
        else {
            System.out.println("이미 시동이 꺼진 상태입니다. 시동상태를 확인해주세요.");
        }
    }
}
