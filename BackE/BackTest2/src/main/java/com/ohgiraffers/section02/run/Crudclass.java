package com.ohgiraffers.section02.run;

import com.ohgiraffers.section02.model.dao.MemberDAO;
import com.ohgiraffers.section02.model.dto.ExcerciseDTO;
import com.ohgiraffers.section02.model.dto.MemberDTO;
import com.ohgiraffers.section02.model.dto.WorkoutlogDTO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Crudclass {
    public void InsertMember(Connection con){
        /*객체, 변수 그후 마지막에 신규 멤버등록*/
        MemberDAO registDAO = new MemberDAO();
        Scanner sc = new Scanner(System.in);

        int maxMemberCode = registDAO.selectLastMemberCode(con);
        System.out.println("maxMemberCode = " + maxMemberCode);


        System.out.print("이름입력:");
        String insertName=sc.nextLine();

        MemberDTO newMem = new MemberDTO(maxMemberCode+1,insertName, new Date(System.currentTimeMillis()));

        int result=registDAO.insertNewMember(con);
        if(result > 0) {
            System.out.println(newMem.toString());
            System.out.println("InsertMember 성공");
        } else {
            System.out.println("Error01");
        }
    }
    public void updateMemberData(Connection con){
        Scanner sc = new Scanner(System.in);
        MemberDAO registDAO = new MemberDAO();

        System.out.print("수정할 ID입력:");
        int memberId=sc.nextInt();
        System.out.println("수정할 이름입력");
        String changeName=sc.nextLine();
        MemberDTO newMem = new MemberDTO(memberId,changeName, new Date(System.currentTimeMillis()));

        registDAO.deleteMember(con);


    }
    public void SearchOneMember(Connection con){
        Scanner sc = new Scanner(System.in);
        MemberDAO registDAO = new MemberDAO();

        System.out.print("조회할 ID입력:");
        int memberId = sc.nextInt();
        MemberDTO member = registDAO.selectMemberById(memberId, con);

        if(member != null) {
            System.out.println("회원 ID: " + member.getMemberID());
            System.out.println("회원 이름: " + member.getMemberName());
            System.out.println("등록일: " + member.getMemberDate());
        } else {
            System.out.println("Error02");
        }
    }
    public void SearchOneMemberAllData(Connection con){
        Scanner sc = new Scanner(System.in);
        MemberDAO registDAO = new MemberDAO();

        System.out.print("조회할 ID입력:");
        int memberId = sc.nextInt();
        WorkoutlogDTO workoutlog = registDAO.selectMemberByIdAllData(memberId, con);

        if(workoutlog != null) {
            System.out.println("회원 ID: " + workoutlog.getMemberID());
            System.out.println("회원이름: " + workoutlog.getMemberName());
            System.out.println("등록일: " + workoutlog.getMemberDate());
            System.out.println("로그 ID: " + workoutlog.getLogID());
            System.out.println("운동일:" + workoutlog.getLogDate());
            System.out.println("입장시간: " + workoutlog.getLogInTime());
            System.out.println("퇴장시간" + workoutlog.getLogOutTime());
        } else {
            System.out.println("Error03");
        }
    }
    public void SearchOneMemberAllData2(Connection con){
        Scanner sc = new Scanner(System.in);
        MemberDAO registDAO = new MemberDAO();
        WorkoutlogDTO workoutlog=new WorkoutlogDTO();

        System.out.print("조회할 ID입력:");
        int memberId=sc.nextInt();
        ExcerciseDTO excerciseDTO = registDAO.selectMemberByIdAllData2(memberId, con);

        if(excerciseDTO != null) {
            System.out.println("회원 ID: " +excerciseDTO.getMemberID());
            System.out.println("회원이름: " +excerciseDTO.getMemberName());
            System.out.println("등록일: " +excerciseDTO.getMemberDate());
            System.out.println("로그 ID: " +excerciseDTO.getLogID());
            System.out.println("운동일:" +excerciseDTO.getLogDate());
            System.out.println("입장시간: " +excerciseDTO.getLogInTime());
            System.out.println("퇴장시간" +excerciseDTO.getLogOutTime());
            System.out.println("운동 ID:"+excerciseDTO.getExrID());
            System.out.println("운동 세트"+excerciseDTO.getExrSet());
            System.out.println("운동 개수"+excerciseDTO.getSetCnt());
        } else {
            System.out.println("Error04");
        }
    }



    public void SearchAllMember(Connection con){
        MemberDAO registDAO=new MemberDAO();
        List<Map<Integer,String>> memberList=registDAO.selectAllMember(con);
        for(Map<Integer, String> member : memberList) {
            System.out.println("ID,MEMBER="+member);
        }
    }
    public void DeleteMember(Connection con){
        MemberDAO registDAO=new MemberDAO();
        int result = registDAO.deleteMember(con);

        if(result > 0) {
            System.out.println("회원 삭제 성공! 삭제된 회원 ID:");
        } else {
            System.out.println("회원 삭제 실패!");
        }

    }


}
