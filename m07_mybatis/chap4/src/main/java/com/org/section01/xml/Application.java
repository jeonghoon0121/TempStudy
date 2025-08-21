package com.org.section01.xml;

import com.org.common.MenuDTO;
import com.org.common.SearchCriteria;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.session.SqlSession;

import java.util.*;

import static com.org.common.SearchCriteria.inputSearchCriteria;
import static com.org.common.Template.getSqlSession;

public class Application{
    public static void main(String[] args) {
//        System.out.println(getSqlSession());
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("----마이바티스 동적 SQL 조건문----");
            System.out.println("1. if");
            System.out.println("2. choose(when, otherwise)");
            System.out.println("3. foreach");
            System.out.println("4. trim(where, set)");
            System.out.println("메뉴");
            int no=sc.nextInt();

            switch (no){
                case 1: ifSubMenu(); break;
                case 2: chooseSubMenu(); break;
                case 3: foreachSubMenu(); break;
                case 4: trimSubMenu(); break;
                case 9:
                    System.out.println("return 0"); return;
            }
        }while(true);
    }
    private static void trimSubMenu() {
        Scanner sc=new Scanner(System.in);
        MenuService menuService = new MenuService();
        do {
            System.out.println("trim 서브메뉴");
            System.out.println("1. 검색조건이 있는경우 메뉴코드로 조회");
            System.out.println("2. 메뉴 혹은 카테고리 둘다 일치하는 경우 검색, 없을경우 전체검사");
            System.out.println("3. 원하는 메뉴 수정");
            System.out.println("9. 이전메뉴");
            System.out.println("메뉴 번호 입력");
            int no = sc.nextInt();
            switch (no){
                case 1: menuService.searchMenuByMenuCodeOrSearchAll(inputAllorOne()); break;
                case 2: menuService.searchMenuByNameOrCategory(inputSearchCriteriaMap()); break;
                case 3: menuService.modifyMenu(inputChangeInfo()); break;
                case 9: return;
            }
        }while(true);
    }

    private static Map<String, Object> inputChangeInfo() {
        Scanner sc=new Scanner(System.in);
        System.out.println("변경할 메뉴 코드를 입력하세요.");
        int code=sc.nextInt();
        System.out.println("변경할 메뉴 이름을 입력하세요");
        sc.nextLine();
        String name= sc.nextLine();
        System.out.println("판매결정여부 Y/N");
        String orderableStatus = sc.nextLine();

        Map<String, Object> criteria=new HashMap<>();
        criteria.put("code", code);
        criteria.put("name",name);
        criteria.put("orderableStatus",orderableStatus);

        return criteria;

    }

    private static Map<String, Object> inputSearchCriteriaMap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("검색할 조건 입력하세요 (category or name or both null)");
        String condition=sc.nextLine();

        Map<String, Object>criteria=new HashMap<>();
        if("category".equals(condition)){
            System.out.println("검색할 카테고리를 입력하세요.");
            int categoryValue=sc.nextInt();

            criteria.put("categoryValue",categoryValue);

        }else if("name".equals(condition)){
            System.out.println("검색할 이름을 입력하세요.");
            String nameValue=sc.nextLine();

            criteria.put("nameValue",nameValue);
        }else if("both".equals(condition)){
            System.out.println("검색할 이름을 입력하세요.");
            String nameValue=sc.nextLine();
            System.out.println("검색할 카테고리 코드를 입력하세요.");
            int categoryValue=sc.nextInt();

            criteria.put("nameValue",nameValue);
            criteria.put("catrgoryValue",categoryValue);
        }
        return criteria;
    }

    private static SearchCriteria inputAllorOne() {
        Scanner sc=new Scanner(System.in);
        System.out.println("검색 조건을 입력하세요(예 아니오)");
        boolean hasSearchValue="예".equals(sc.nextLine())?true:false;

        SearchCriteria searchCriteria=new SearchCriteria();
        if(hasSearchValue){
            System.out.println("검색할 메뉴 코드를 입력하세요.");
            String code = sc.nextLine();
           searchCriteria.setCondition("menuCode");
           searchCriteria.setValue(code);
        }
        return searchCriteria;
    }
    private static void foreachSubMenu() {
        Scanner sc=new Scanner(System.in);
        MenuService menuServic=new MenuService();
        do{
            System.out.println("foreach 서브메뉴");
            System.out.println("1. 랜덤한 메뉴 5개 추출 조회");
            System.out.println("9.이전메뉴로");
            System.out.print("메뉴 번호를 입력하세요.");
            int no=sc.nextInt();
            switch (no){
                case 1: menuServic.searchMenuByRandomMenuCode(createRandomMenuCodeList());break;
                case 9: return;
            }
        }while(true);
    }
    private static void chooseSubMenu() {
        Scanner sc=new Scanner(System.in);
        MenuService menuServic=new MenuService();
        do{
            System.out.println("choose 서브메뉴");
            System.out.println("1.카테고리 상위 분류별 메뉴 보여주기(식사, 음료, 디저트)");
            System.out.println("9.이전메뉴로");
            System.out.print("메뉴 번호를 입력하세요.");
            int no=sc.nextInt();
            switch (no){
                case 1: menuServic.searchMenuBySupCategory(inputSubCategory());break;
                case 9: return;
            }
        }while(true);
    }
    private static SearchCriteria inputSubCategory() {
        Scanner sc=new Scanner(System.in);
        System.out.print("상위 분류를 입력해주세요. (식사, 음료, 디저트)");
        String value=sc.nextLine();

        return new SearchCriteria("category",value);
    }

    private static void ifSubMenu() {
        Scanner sc = new Scanner(System.in);
        MenuService menuService = new MenuService();
        do {
            System.out.println(("if서브메뉴"));
            System.out.println(("1.금액대 적합한 추천 매뉴"));
            System.out.println(("2. 메뉴이름 혹은 카테고리명으로 검색하여 메뉴목록 보여주기"));
            System.out.println(("9. 이전 메뉴로"));
            System.out.println(("매뉴 번호를 입력하세요"));
            int no = sc.nextInt();
            switch (no) {
                case 1:menuService.selectMenuByPrice(inputPrice()); break;
                case 2:menuService.searchMenu(inputSearchCriteria());break;
                case 9:return;
            }
        } while (true);
    }
    private static int inputPrice(){
        Scanner sc=new Scanner(System.in);
        System.out.print("최대 금액을 입력하세요.");
        int price=sc.nextInt();
        return price;
    }
    private static List<Integer> createRandomMenuCodeList() {
        Set<Integer> set=new HashSet<>();
        while(set.size()<5){
            int temp=((int)(Math.random()*21))+1;
            set.add(temp);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}