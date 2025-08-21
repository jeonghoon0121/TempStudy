package com.org.section01.xmlmapper;
import com.org.common.MenuAndCategoryDTO;
import com.org.common.MenuDTO;

import java.util.List;

public interface ElementTestMapper {
    List<MenuDTO> selectResultMapTest();
    List<MenuDTO> selectResultMapConstructorTest();
    List<MenuAndCategoryDTO> selectResultMapAssociationTest();
}
