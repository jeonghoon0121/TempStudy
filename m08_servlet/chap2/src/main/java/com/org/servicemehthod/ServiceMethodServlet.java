package com.org.servicemehthod;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/request-service")
public class ServiceMethodServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        HttpServletRequest httpRequest=(HttpServletRequest) req;
        HttpServletResponse httpResponse=(HttpServletResponse) res;

        String httpMethod=httpRequest.getMethod();
        System.out.println("httpMethod()"+httpMethod);
        if(("GET").equals(httpMethod)){
            doGet(httpRequest,httpResponse);
        }else if(("POST").equals(httpMethod)){
            doPost(httpRequest,httpResponse);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post 방식 메소드 호출");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get 방식 메소드 호출");

    }

}
