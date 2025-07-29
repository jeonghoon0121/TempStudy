package com.ohgiraffers.practice02.level03.hard.emp.run;

import com.ohgiraffers.practice02.level03.hard.emp.model.dto.DTO;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        DTO dto=new DTO();
        Scanner sc= new Scanner(System.in);

        System.out.print("number :");
        int num1=sc.nextInt();
        sc.nextLine();
        System.out.print("name :");
        String name1= sc.nextLine();
        System.out.print("부서");
        String dept1=sc.nextLine();
        System.out.print("직급");
        String job=sc.nextLine();
        System.out.print("나이");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.print("성");
        char gender= sc.next().charAt(0);

        System.out.print("보너스");
        double bonus= sc.nextDouble();
        sc.nextLine();
        System.out.println("전화");
        String phone =sc.nextLine();

        System.out.println("주소");
        String address = sc.nextLine();

        dto.setNumber(num1);
        dto.setName(name1);
        dto.setDept(dept1);
        dto.setJob(job);
        dto.setAge(age);
        dto.setGender(gender);
        dto.setBonusPoint(bonus);
        dto.setPhone(phone);
        dto.setAddress(address);

        System.out.println(dto.getNumber());
        System.out.println(dto.getName());
        System.out.println(dto.getDept());
        System.out.println(dto.getJob());
        System.out.println(dto.getAge());
        System.out.println(dto.getGender());
        System.out.println(dto.getBonusPoint());
        System.out.println(dto.getPhone());
        System.out.println(dto.getAddress());

    }
}
