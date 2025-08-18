package com.ohgiraffers.section02.model.dao;

import com.ohgiraffers.section02.model.dto.ExcerciseDTO;
import com.ohgiraffers.section02.model.dto.MemberDTO;
import com.ohgiraffers.section02.model.dto.WorkoutlogDTO;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.sql.Date;
import java.util.*;

import static com.ohgiraffers.common.JDBCTemplate.close;
/*
*
*
*
    public int selectLastMemberCode(Connection con)
    selectAllMember
    selectAllMember
    selectMemberById
    selectMemberByIdAllData
    selectMemberByIdAllData2
*
*
*
*
*
*
*
*
* */







public class MemberDAO {
    private Properties prop = new Properties();

    public MemberDAO() {
        try {
            prop.loadFromXML(new FileInputStream("C:\\lecture\\BackE\\BackTest2\\src\\main\\java\\com\\ohgiraffers\\mapper\\member-query.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public int selectLastMemberCode(Connection con) {
        Statement stmt = null;
        ResultSet rset = null;
        int maxMemberCode = 0;
        String query = prop.getProperty("selectLastMemberCode");
        try {
            stmt = con.createStatement();
            rset = stmt.executeQuery(query);
            if(rset.next()) {
                maxMemberCode = rset.getInt("MAX(A.MEM_ID)");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(rset);
            close(stmt);
        }
        return maxMemberCode;
    }

    public List<Map<Integer, String>> selectAllMember(Connection con){
        Statement stmt = null;
        ResultSet rset = null;
        List<Map<Integer, String>> memberList = null;

        String query = prop.getProperty("selectAllMemberList");

        try {
            stmt=con.createStatement();
            rset=stmt.executeQuery(query);
            memberList=new ArrayList<>();
            while(rset.next()){
                Map<Integer, String> memberlist=new HashMap<>();
                memberlist.put(rset.getInt("MEM_ID"), rset.getString("MEM_NM"));
                memberList.add(memberlist);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally{
            close(rset);
            close(stmt);
        }
        return memberList;
    }
    public MemberDTO selectMemberById(int memberId, Connection con) {
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        MemberDTO member = null;
        String query = prop.getProperty("selectMemberById");
        try {
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, memberId);
            rset = pstmt.executeQuery();
            if (rset.next()) {
                member = new MemberDTO(
                        rset.getInt("MEM_ID"),
                        rset.getString("MEM_NM"),
                        rset.getDate("MEM_DATE")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException("회원 조회 실패", e);
        } finally {
            close(rset);
            close(pstmt);
        }
        return member;
    }
    public WorkoutlogDTO selectMemberByIdAllData(int memberId, Connection con) {
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        MemberDTO member = null;
        WorkoutlogDTO workoutlog=null;

        String query = prop.getProperty("selectAllData");

        System.out.println(query);

        try {
            System.out.println("1");
            pstmt = con.prepareStatement(query);
            System.out.println("2");
            pstmt.setInt(1, memberId); // ?에 값 설정
            System.out.println("3");
            rset = pstmt.executeQuery(); // SQL 실행 → 결과 받아오기

            while (rset.next()) {
                if (member == null) {
                    member = new MemberDTO(
                            rset.getInt("MEM_ID"),
                            rset.getString("MEM_NM"),
                            rset.getDate("MEM_DATE")
                    );

                    workoutlog = new WorkoutlogDTO(
                            member,
                            rset.getInt("LOG_ID"),
                            rset.getDate("LOG_DATE"),
                            rset.getTime("LOG_INTIME"),
                            rset.getTime("LOG_OUTTIME")
                    );
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("회원 조회 실패", e);
        } finally {
            close(rset);
            close(pstmt);
        }
        return workoutlog;
    }
    public ExcerciseDTO selectMemberByIdAllData2(int memberId, Connection con) {
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        MemberDTO member = null;
        WorkoutlogDTO workoutlog=null;
        ExcerciseDTO excerciseDTO=null;

        String query = prop.getProperty("selectAllData2");

        System.out.println(query);

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, memberId); // ?에 값 설정
            rset = pstmt.executeQuery(); // SQL 실행 → 결과 받아오기

            while (rset.next()) {
                if (member == null) {
                    member = new MemberDTO(
                            rset.getInt("MEM_ID"),
                            rset.getString("MEM_NM"),
                            rset.getDate("MEM_DATE")
                    );

                    workoutlog = new WorkoutlogDTO(
                            member,
                            rset.getInt("LOG_ID"),
                            rset.getDate("LOG_DATE"),
                            rset.getTime("LOG_INTIME"),
                            rset.getTime("LOG_OUTTIME")
                    );
                    excerciseDTO=new ExcerciseDTO(
                            workoutlog,
                            rset.getInt("EXR_ID"),
                            rset.getInt("EXR_SET"),
                            rset.getInt("EXR_CNT")
                    );
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("회원 조회 실패", e);
        } finally {
            close(rset);
            close(pstmt);
        }
        return excerciseDTO;
    }
    public int updateMember(Connection con){
        return 1;
    }


    public int insertNewMember( Connection con) {
        PreparedStatement pstmt = null;
        MemberDTO newMem =new MemberDTO();
        int result = 0;
        String query = prop.getProperty("insertMember");
        try {
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, newMem.getMemberID());
            pstmt.setString(2, newMem.getMemberName());
            pstmt.setDate(3, new Date(newMem.getMemberDate().getTime()));

            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(pstmt);
        }
        return result;
    }

    public int deleteMember(Connection con) {
        MemberDTO Mem=new MemberDTO();
        int deletenumber=0;
        Scanner sc=new Scanner(System.in);
        PreparedStatement pstmt = null;

        System.out.print("삭제할 아이디는?");
        deletenumber=sc.nextInt();

        int result = 0;
        String query = prop.getProperty("deleteMember");
        try {
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, deletenumber);
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(pstmt);
        }
        return result;
    }

}
