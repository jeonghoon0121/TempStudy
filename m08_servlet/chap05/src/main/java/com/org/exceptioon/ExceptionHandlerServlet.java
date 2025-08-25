package com.org.exceptioon;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/showErrorPage")
public class ExceptionHandlerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //System.out.println("test");
        Enumeration<String> attname=request.getAttributeNames();
        while(attname.hasMoreElements()) {
            System.out.println(attname.nextElement());
        }
        Integer statusCode=(Integer) request.getAttribute("jakarta.servlet.error.status_code");
        String message=(String) request.getAttribute("jakarta.servlet.error.message");
        System.out.println("statusCode"+statusCode);
        System.out.println("message="+message);

        StringBuilder errorPage=new StringBuilder();
        errorPage.append("<!doctype html>")
                .append("<html>")
                .append("<head><title>Error Page</title></head>")
                .append("<body>")
                .append("<h1>")
                .append(statusCode)
                .append(" - ")
                .append(message)
                .append("</h1>")
                .append("</body>")
                .append("</html>");
        response.setContentType("text/html");
        response.getWriter().write(errorPage.toString());



    }
}
