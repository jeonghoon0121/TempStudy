package com.org.section02.javaconfig;
import java.util.List;
import java.util.Map;

public class MenuController {
    private final PrintResult printResult;
    private final MenuService menuService;
    public MenuController(){
        printResult=new PrintResult();
        menuService = new MenuService();
    }
    public void selectAllMenu(){

        List<MenuDTO> menuList=menuService.selectAllMenu();
        /*결과*/
        if(menuList!=null){
            printResult.printMenuList(menuList);
        }
        else {
            printResult.printErrorMessage("selectList");
        }
    }

    public void selectMenuByCode(Map<String, String> parameter) {
        /*컨트롤러에서 파싱*/
        int code=Integer.parseInt(parameter.get("code"));
        MenuDTO menu=menuService.selectMenuByCode(code);
        /**/
        if(menu!=null){
            printResult.printMenu(menu);

        }else{
            printResult.printErrorMessage("selsctone");
        }

    }
//
    public void registMenu(Map<String, String> parameter) {
        String name=parameter.get("name");
        int price=Integer.parseInt(parameter.get("price"));
        int categoryCode=Integer.parseInt(parameter.get("categoryCode"));

        MenuDTO menu = new MenuDTO();
        menu.setName(name);
        menu.setPrice(price);
        menu.setCategoryCode(categoryCode);
        if(menuService.registMenu(menu)){
            printResult.printSuccessMessage("insert");
        }else{
            printResult.printErrorMessage("insert");
        }
    }
//
//    public void modifyMenu(Map<String, String> parameter) {
//        int code=Integer.parseInt(parameter.get("code"));
//
//        MenuDTO menu=new MenuDTO();
//        menu.setCode(code);
//        if(menuService.modifyMenu(menu)){
//            printResult.printSuccessMessage("update");
//        }else{
//            printResult.printErrorMessage("update");
//        }
//    }
//
//    public void deleteMenu(Map<String, String> parameter) {
//
//        int code=Integer.parseInt(parameter.get("code"));
//
//
//        if(menuService.deleteCode(code)){
//            printResult.printSuccessMessage("delete");
//        }else{
//            printResult.printErrorMessage("delete");
//        }
//    }
}
