package org.example.lv4;

/**
 * 메뉴의 속성을 정의하는 클래스
 */
public class MenuItem {
    String name;
    double price;
    String description;

    MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
}
