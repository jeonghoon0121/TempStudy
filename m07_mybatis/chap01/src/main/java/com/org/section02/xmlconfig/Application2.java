package com.org.section02.xmlconfig;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.io.InputStream;

public class Application2 {
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        SqlSessionFactory sqlSessionFactory;
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession(false);
            java.util.Date date = sqlSession.selectOne("mapper.selectSysdate");
            System.out.println(date);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        SqlSession sqlSession = sqlSessionFactory.openSession(false);
        System.out.println(sqlSessionFactory.hashCode());
        System.out.println(sqlSession.hashCode());
    }

}
