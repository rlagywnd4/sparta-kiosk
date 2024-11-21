package org.example.lv3;

import java.util.List;
import java.util.Scanner;

/**
 *  키오스크 클래스
 *  menuItem을 관리하고 사용자 입력을 처리하는 클래스입니다.
 */
public class Kiosk {
    List<MenuItem> menuItems;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    /**
     * start()
     * 사용자 입력을 받고 메뉴를 출력하는 키오스크 기능을 실행하는 메소드입니다.
     */
    public void start(){
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while(isRunning){
            System.out.println("[ SHAKESHACK MENU ]");

            // print menu
            for(int i = 0; i < menuItems.size(); i++){
                System.out.println((i+1)+". "+menuItems.get(i).name+ "\t| W "+menuItems.get(i).price+" | "+menuItems.get(i).description);
            }
            System.out.println("0. 종료\t\t| 종료");

            switch (scanner.next()){
                case "1":
                    System.out.println("1. "+menuItems.get(0).name+ "\t| W "+menuItems.get(0).price+" | "+menuItems.get(0).description);
                    break;
                case "2":
                    System.out.println("2. "+menuItems.get(1).name+ "\t| W "+menuItems.get(1).price+" | "+menuItems.get(1).description);
                    break;
                case "3":
                    System.out.println("3. "+menuItems.get(2).name+ "\t| W "+menuItems.get(2).price+" | "+menuItems.get(2).description);
                    break;
                case "4":
                    System.out.println("4. "+menuItems.get(3).name+ "\t| W "+menuItems.get(3).price+" | "+menuItems.get(3).description);
                    break;
                case "0":
                    isRunning = false;
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
            }
            System.out.println();
        }
    }
}
