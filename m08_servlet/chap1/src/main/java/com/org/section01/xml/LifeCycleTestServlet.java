package com.org.section01.xml;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

public class LifeCycleTestServlet extends HttpServlet {
    private int initCount=1;
    private int serviceCount=1;
    private int destroyCount=1;
    //각각의 메소드 호출 횟수를 카운트 할 목적

    public LifeCycleTestServlet(){}
    /*최초 서블릿 요청 시에 동작하는 메소드*/
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("xml 매핑 init()"+initCount++);
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
        System.out.println("xml 매핑 service() 메소드 호출"+serviceCount++);
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("xml 매핑 destroy() 메소드 호출"+destroyCount++);
    }
}
