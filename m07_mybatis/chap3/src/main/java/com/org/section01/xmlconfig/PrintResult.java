package com.org.section01.xmlconfig;


import java.util.List;

public class PrintResult {

    public void printMenuList(List<MenuDTO> menuList) {
        for(MenuDTO menu:menuList){
            System.out.println(menu);
        }
    }

    public void printResultMessage(String errorCode) {
        String errorMessage="";
        switch(errorCode){
            case "selectList" : errorMessage="메뉴목록조회실패";
                break;
        }
        System.out.println(errorMessage);
    }
}
