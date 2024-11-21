package org.example.lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        boolean isRunning = true;
        while(isRunning){
            System.out.println("[ SHAKESHACK MENU ]");

            // print menu
            for(int i = 0; i < menuItems.size(); i++){
                System.out.println((i+1)+". "+menuItems.get(i).name+ "\t| W "+menuItems.get(i).price+" | "+menuItems.get(i).descriptrion);
            }
            System.out.println("0. 종료\t\t| 종료");

            switch (scanner.next()){
                case "1":
                    System.out.println("1. "+menuItems.get(0).name+ "\t| W "+menuItems.get(0).price+" | "+menuItems.get(0).descriptrion);
                    break;
                case "2":
                    System.out.println("2. "+menuItems.get(1).name+ "\t| W "+menuItems.get(1).price+" | "+menuItems.get(1).descriptrion);
                    break;
                case "3":
                    System.out.println("3. "+menuItems.get(2).name+ "\t| W "+menuItems.get(2).price+" | "+menuItems.get(2).descriptrion);
                    break;
                case "4":
                    System.out.println("4. "+menuItems.get(3).name+ "\t| W "+menuItems.get(3).price+" | "+menuItems.get(3).descriptrion);
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