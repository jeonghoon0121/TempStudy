package com.org.section01.xml;

import com.org.common.MenuDTO;
import com.org.common.SearchCriteria;

import java.util.List;
import java.util.Map;

public interface DynamicMapper {

    List selectMenuByPrice(Map<String, Integer> map);
    List<MenuDTO> searchMenu(SearchCriteria searchCriteria);
    List<MenuDTO> searchMenuBySubCategory(SearchCriteria searchCriteria);
    List<MenuDTO> searchMenuByRandomMenuCode(Map<String, List<Integer>> criteria);
    List<MenuDTO> searchMenuByMenuCodeOrSearchAll(SearchCriteria searchCriteria);


    List<MenuDTO> searchMenuByNameOrCategory(Map<String, Object> criteria);

    int modifyMenu(Map<String, Object> criteria);
}
