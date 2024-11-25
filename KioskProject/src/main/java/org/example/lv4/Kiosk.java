package org.example.lv4;

import java.util.List;
import java.util.Scanner;

/**
 * menuItem을 관리하고 사용자 입력을 처리하는 클래스
 */
public class Kiosk {
    /**
     * 사용자 입력을 받고 메뉴를 출력하는 키오스크 기능을 실행
     */
    public void start(List<Menu> menu) {
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("[ SHAKESHACK MENU ]");

            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i + 1) + ". " + menu.get(i).getCategory());
            }
            System.out.println("0. 종료\t\t| 종료");

            int category = scanner.nextInt();

            if (0 < category && category <= menu.size()) {
                menu.get(category - 1).printMenuItems();

                System.out.println("0. 뒤로가기");
            } else if (category == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            int menuItem = scanner.nextInt();
            if (0 < menuItem && menuItem <= menu.get(category - 1).menuItems.size()) {
                System.out.println("선택한 메뉴: " + menu.get(category - 1).menuItems.get(menuItem - 1).name + "\t| W " + menu.get(category - 1).menuItems.get(menuItem - 1).price + " | " + menu.get(category - 1).menuItems.get(menuItem - 1).description);
            } else if (menuItem == 0) {
            } else {
                System.out.println("잘못된 입력입니다.");
            }
            System.out.println();
        }
    }
}
