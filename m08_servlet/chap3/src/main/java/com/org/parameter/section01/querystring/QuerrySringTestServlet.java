package com.org.parameter.section01.querystring;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/querystring")
public class QuerrySringTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse responese) throws ServletException, IOException {
        String name=request.getParameter("name");
        System.out.println("name="+name);

        int age=Integer.parseInt(request.getParameter("age"));

        java.sql.Date birthday = java.sql.Date.valueOf(request.getParameter("birthday"));
        System.out.println("birthday="+birthday);

        String gender= request.getParameter("gender");
        System.out.println("gender"+gender);

        String national=request.getParameter("national");
        System.out.println("national"+national);

        System.out.println("취미 : ");
        String[] hobbies=request.getParameterValues("hobbies");
        for(String hobby:hobbies){
            System.out.println("hobby="+hobby);
        }

    }
}
