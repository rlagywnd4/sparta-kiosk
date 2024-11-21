package org.example.lv3;

/**
 * MenuItem
 * 메뉴의 속성을 정의하는 클래스입니다.
 * 이름, 가격, 설명을 저장할 수 있습니다.
 */
public class MenuItem {
    String name;
    double price;
    String description;

    MenuItem(String name, double price, String description){
        this.name = name;
        this.price = price;
        this.description = description;
    }
}
