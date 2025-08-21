package com.org.section01.xml;
import com.org.common.MenuDTO;
import com.org.common.SearchCriteria;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import static com.org.common.Template.getSqlSession;

public class MenuService {
    private DynamicMapper mapper;

    public void selectMenuByPrice(int price) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(DynamicMapper.class);

        Map<String, Integer> map = new HashMap<>();
        map.put("price", price);
        List<MenuDTO> menuList = mapper.selectMenuByPrice(map);
        if (menuList != null && menuList.size() > 0) {
            for (MenuDTO menu : menuList) {
                System.out.println(menu);
            }
        } else {
            System.out.println("검색결과가 존재하지 않습니다.");
        }
    }

    public void searchMenu(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(DynamicMapper.class);
        List<MenuDTO> menuList = mapper.searchMenu(searchCriteria);
        if (menuList != null && menuList.size() > 0) {
            for (MenuDTO menu : menuList) {
                System.out.println(menu);
            }
        } else {
            System.out.println("검색결과가 존재하지 않음");
        }
        sqlSession.close();

    }

    public void searchMenuBySupCategory(SearchCriteria searchCriteria){
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(DynamicMapper.class);
        List<MenuDTO> menuList = mapper.searchMenuBySubCategory(searchCriteria);
        if (menuList != null && menuList.size() > 0) {
            for (MenuDTO menu : menuList) {
                System.out.println(menu);
            }
        } else {
            System.out.println("검색결과가 존재하지 않음");
        }
        sqlSession.close();

    }

    public void searchMenuByRandomMenuCode(List<Integer> randomMenuCodeList) {
        SqlSession sqlSession = getSqlSession();
        mapper=sqlSession.getMapper(DynamicMapper.class);

        Map<String, List<Integer>> criteria = new HashMap<>();
        criteria.put("randomMenuCodeList",randomMenuCodeList);
        List<MenuDTO> menuList=mapper.searchMenuByRandomMenuCode(criteria);

        if (menuList != null && menuList.size() > 0) {
            for (MenuDTO menu : menuList) {
                System.out.println(menu);
            }
        } else {
            System.out.println("검색결과가 존재하지 않음");
        }
        sqlSession.close();
    }

    public void searchMenuByMenuCodeOrSearchAll(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();
        mapper=sqlSession.getMapper(DynamicMapper.class);
        List<MenuDTO> menuList=mapper.searchMenuByMenuCodeOrSearchAll(searchCriteria);

        if (menuList != null && menuList.size() > 0) {
            for (MenuDTO menu : menuList) {
                System.out.println(menu);
            }
        } else {
            System.out.println("검색결과가 존재하지 않음");
        }
        sqlSession.close();
    }

    public void searchMenuByNameOrCategory(Map<String, Object> criteria) {
        SqlSession sqlSession = getSqlSession();
        mapper=sqlSession.getMapper(DynamicMapper.class);
        List<MenuDTO> menuList=mapper.searchMenuByNameOrCategory(criteria);

        if (menuList != null && menuList.size() > 0) {
            for (MenuDTO menu : menuList) {
                System.out.println(menu);
            }
        } else {
            System.out.println("검색결과가 존재하지 않음");
        }
        sqlSession.close();
    }

    public void modifyMenu(Map<String, Object> criteria) {
        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(DynamicMapper.class);
        int result=mapper.modifyMenu(criteria);
        if(result>0){
            System.out.println("메뉴 변경에 성공하였씁니다.");
            sqlSession.commit();
        }
        else{
            System.out.println("메뉴 정보 변경에 실패");
            sqlSession.rollback();
        }
    }
}