package com.ohgiraffers.section01.statement;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application5 {
    public static void main(String[] args) throws SQLException, RuntimeException {
        Connection con = getConnection();
        Statement stmt=null;
        ResultSet rset=null;
        EmployeeDTO row=null;
        EmployeeDTO selectedEmp=null;

        List<EmployeeDTO> empList=null;

        String query="SELECT * FROM EMPLOYEE";

        try{
            stmt=con.createStatement();
            rset=stmt.executeQuery(query);

            empList=new ArrayList<>();

            selectedEmp=new EmployeeDTO();
            selectedEmp.setEmpId(rset.getString("EMP_ID"));
            selectedEmp.setEmpName(rset.getString("EMP_NAME"));
            selectedEmp.setEmpNo(rset.getString("EMP_NO"));
            selectedEmp.setEmail(rset.getString("EMAIL"));
            selectedEmp.setPhone(rset.getString("PHONE"));
            selectedEmp.setDeptCode(rset.getString("DEPT_CODE"));
            selectedEmp.setSalLevel(rset.getString("JOB_CODE"));

            selectedEmp.setSalary(rset.getString("SALARY"));
            empList.add(selectedEmp);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }




        for(EmployeeDTO emp:empList){
            System.out.println(emp.getEmpId());
        }



    }

}
