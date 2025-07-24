package ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    public Computer(){
        System.out.println("Computer생성자 호출");
    }
    //부모의 필드도 모두 초기화

    public Computer(String code, String brand, String name, int priced, Date manuFactureingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, priced, manuFactureingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }
//모든 필드를 초기화하는 생성자, super도 쓸수 있음

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        super();
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("computer클래스의 모든 필드를 초기화하는 생성자 호출함");
    }

    public String getCpu() {
        return cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public int getRam() {
        return ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }


}
