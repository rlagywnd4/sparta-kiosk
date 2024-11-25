package org.example.lv4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Menu burgers = new Menu("Burgers");
        burgers.menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu drinks = new Menu("Drinks");
        drinks.menuItems.add(new MenuItem("Yuja Basil Lemonade", 5.7, "레몬에이드에 프레시한 바질과 상큼한 유자의 향을 더한 스페셜 레몬에이드"));
        drinks.menuItems.add(new MenuItem("Fresh Brewed Iced Tea", 4.4, "직접 유기농 홍차를 우려낸 아이스 티"));
        drinks.menuItems.add(new MenuItem("Fifty/Fifty", 4.7, "레몬에이드와 유기농 홍차를 우려낸 아이스 티가 만나 탄생한 쉐이크쉑의 시그니처 음료"));
        drinks.menuItems.add(new MenuItem("Abita Root Beer", 5.0, "청량감 있는 독특한 미국식 무알콜 탄산음료"));

        Menu dessert = new Menu("Dessert");
        dessert.menuItems.add(new MenuItem("Vanilla Cookie & Cream Shake", 7.8, "부드러운 바닐라 커스터드와 바삭한 쿠키 크럼블이 어우러진 홀리데이 쉐이크"));
        dessert.menuItems.add(new MenuItem("Chocolate Peppermint Shake", 7.8, "달콤한 초콜릿 커스터드에 페퍼민트 향을 블렌딩하여 크리스마스 캔디를 올린 홀리데이 쉐이크"));
        dessert.menuItems.add(new MenuItem("Classic Hand-Spun Shakes", 6.8, "쫀득하고 진한 커스터드가 들어간 클래식 쉐이크(바닐라/초콜릿/스트로베리/블랙 & 화이트/솔티드 카라멜/피넛 버터/커피)"));
        dessert.menuItems.add(new MenuItem("Shack Attack", 9.3, "진한 초콜릿 커스터드에 퍼지 소스와 세 가지 초콜릿 토핑이 블렌딩된 쉐이크쉑의 대표 콘크리트"));
        dessert.menuItems.add(new MenuItem("Shack-ffogato", 9.3, "바닐라 커스터드에 커피 카라멜 소스, 초콜릿 토피, 초콜릿 청크, 코코아 파우더가 어우러진 쉐이크쉑만의 아포가토 콘크리트"));

        List<Menu> menu = new ArrayList<>();
        menu.add(burgers);
        menu.add(drinks);
        menu.add(dessert);

        Kiosk kiosk = new Kiosk();
        kiosk.start(menu);

    }
}