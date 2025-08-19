package com.org.section02.javaconfig;

import java.util.List;

public class PrintResult {
    public void printMenuList( List <MenuDTO> menuList) {
        for(MenuDTO menu:menuList){
            System.out.println(menu);
        }
    }
    public void printMenu(MenuDTO menu) {
    }
    public void printErrorMessage(String errorCode) {
        String errorMessage="";
        switch(errorCode){
            case "selectList" : errorMessage="메뉴목록조회실패"; break;
            case "selctone" : errorMessage="메뉴상세조회실패"; break;
            case "insert" : errorMessage="신규메뉴등록실패"; break;
            case "update" : errorMessage="메뉴수정실패"; break;
            case "delete" : errorMessage="메뉴삭제실패"; break;
            
        }
        System.out.println(errorMessage);
    }
    public void printSuccessMessage(String successCode) {
        String successMessage="";
        switch (successCode){
            case "insert" : successMessage="신규메뉴등록성공";break;
            case "update" : successMessage="메뉴수정성공";break;
            case "delete" : successMessage="메뉴삭제성공";break;
        }
        System.out.println(successMessage);
    }


}
