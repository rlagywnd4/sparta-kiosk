package org.example.lvup1;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    List<Menu> menus;
    ShoppingCart cart;

    Kiosk(List<Menu> menus) {
        this.menus = menus;
        this.cart = new ShoppingCart();
    }

    /**
     * 사용자 입력을 받고 메뉴를 출력하는 키오스크 기능을 실행
     */
    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMainMenu();

            int category = scanner.nextInt();
            boolean isExit = processUserSelection(category);
            if (isExit) {
                break;
            }
        }
    }

    /**
     * 메인 메뉴 출력
     * (카테고리와 오더메뉴 출력)
     */
    void printMainMenu() {
        System.out.println("[ MAIN MENU ]");

        for (int i = 0; i < menus.size(); i++) {
            System.out.println((i + 1) + ". " + menus.get(i).getCategory());
        }
        System.out.println("0. 종료\t\t| 종료");

        if (!cart.isEmpty()) {
            System.out.println("\n[ ORDER MENU ]");
            System.out.println((menus.size() + 1) + ". Orders\t\t| 장바구니를 확인 후 주문합니다.");
            System.out.println((menus.size() + 2) + ". Cancel\t\t| 진행중인 주문을 취소합니다.");
        }
    }

    /**
     * 사용자가 선택한 메인메뉴를 실행합니다.
     * - MenuItem 선택
     * - 오더 메뉴 실행
     * - 주문 취소
     *
     * @param category 사용자가 선택한 메뉴 옵션 (정수 값)
     * @return true: 프로그램 종료, false: 계속 진행
     */
    boolean processUserSelection(int category) {
        if (0 < category && category <= menus.size()) {
            menus.get(category - 1).printMenuItems();
            selectItem(category);
        } else if (category == 0) {
            System.out.println("프로그램을 종료합니다.");
            return true;
        } else if (!cart.isEmpty() && category == (menus.size() + 1)) {
            cart.orderCart();
        } else if (!cart.isEmpty() && category == (menus.size() + 2)) {
            cart.cancelCart();
        } else {
            System.out.println("잘못된 입력입니다.");
        }
        return false;
    }

    /**
     * MenuItem  선택하기
     * @param category
     */
    void selectItem(int category){
        Scanner scanner = new Scanner(System.in);

        int selectedItem = scanner.nextInt();
        if (0 < selectedItem && selectedItem <= menus.get(category - 1).getMenuItems().size()) {
            System.out.println("선택한 메뉴: " + menus.get(category - 1).getMenuItems().get(selectedItem - 1).getName() + "\t| W " + menus.get(category - 1).getMenuItems().get(selectedItem - 1).getPrice() + " | " + menus.get(category - 1).getMenuItems().get(selectedItem - 1).getDescription());
        } else if (selectedItem != 0) {
            System.out.println("잘못된 입력입니다.");
            return;
        } else if (selectedItem == 0) {
            return;
        }
        System.out.println();
        askItemToCart(menus.get(category - 1).getMenuItems().get(selectedItem - 1));
    }

    /**
     * 장바구니에 메뉴추가 여부 확인 후 처리
     * @param menuItem
     */
    void askItemToCart(MenuItem menuItem) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인\t2. 취소");

        int choice = scanner.nextInt();
        if (choice == 1) {
            cart.addItemToCart(menuItem);
        } else if (choice == 2) {
            System.out.println("취소되었습니다.");
        } else {
            System.out.println("잘못된 입력입니다.");
            askItemToCart(menuItem);
        }
    }
}
