package org.example.lv2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> menus = new ArrayList<>();
        menus.add("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        menus.add("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        menus.add("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        menus.add("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");

        boolean isRunning = true;
        while(isRunning){
            System.out.println("[ SHAKESHACK MENU ]");

            menus.forEach(System.out::println);
            System.out.println("0. 종료      | 종료");

            switch (scanner.next()){
                case "1":
                    System.out.println(menus.get(0));
                    break;
                case "2":
                    System.out.println(menus.get(1));
                    break;
                case "3":
                    System.out.println(menus.get(2));
                    break;
                case "4":
                    System.out.println(menus.get(3));
                    break;
                case "0":
                    isRunning = false;
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
            }
        }

    }
}