package org.example.lv4;

import java.util.ArrayList;
import java.util.List;

/**
 * MenuItem 클래스를 관리하는 클래스입니다.
 */
public class Menu {
    List<MenuItem> menuItems;
    String category;

    public Menu(String category) {
        this.category = category;
        this.menuItems = new ArrayList<>();
    }

    String getCategory() {
        return this.category;
    }

    /**
     * MenuItem을 순차적으로 출력
     */
    public void printMenuItems() {
        System.out.println("[ " + this.category.toUpperCase() + " MENU ]");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i).name + "\t| W " + menuItems.get(i).price + " | " + menuItems.get(i).description);
        }
    }
}
