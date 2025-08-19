package com.org.section02.javaconfig;
import org.apache.ibatis.session.SqlSession;

import static com.org.section02.javaconfig.Template.getSqlSession;

public MenuDTO selectMenuByCode(int code) {
    SqlSession sqlSession = getSqlSession();
    menuMapper=sqlSession.getMapper(MenuMapper.class);
    MenuDTO menuDTO =menuMapper.selectMenuByCode(code);
    sqlSession.close();
    return menu;
}
//
//    public boolean registMenu(MenuDTO menu) {
//        SqlSession sqlSession = getSqlSession();
//        int result=menuDAO.insertMenu(sqlSession,menu);
//        if(result>0){
//            sqlSession.commit();
//        }else{
//            sqlSession.rollback();
//        }
//        sqlSession.close();
//        return result > 0? true:false;
//    }
//
//    public boolean modifyMenu(MenuDTO menu) {
//        SqlSession sqlSession=getSqlSession();
//        int result=menuDAO.updateMenu(sqlSession,menu);
//
//        if(result>0){
//            sqlSession.commit();
//        }else{
//            sqlSession.rollback();
//        }
//        sqlSession.close();
//        return result>0?true:false;
//    }
//
//
//
//    public boolean deleteCode(int code) {
//        SqlSession sqlSession=getSqlSession();
//        int result=menuDAO.deleteMenu(sqlSession,code);
//        if(result>0){
//            sqlSession.commit();
//        }else{
//            sqlSession.rollback();
//        }
//        sqlSession.close();
//        return result>0?true:false;
//    }
