package org.example.lvup1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 장바구니 클래스
 */
public class ShoppingCart {
    private List<MenuItem> items;
    public ShoppingCart(){
        this.items = new ArrayList<>();
    }

    /**
     * 장바구니 비어있는지 확인
     * @return true: 아이템 없음, false: 아이템 있음
     */
    public boolean isEmpty(){
        if(items.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 장바구니에 있는 아이템 주문하기
     */
    void orderCart(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("아래와 같이 주문 하시겠습니까?\n");
        System.out.println("[ Orders ]");
        items.forEach((item)-> System.out.println(item.getName() + "\t| W "+ item.getPrice()+" | "+item.getDescription()));
        System.out.println();

        System.out.println("[ Total ]");
        double totalPrice = items.stream().mapToDouble(MenuItem::getPrice).sum();
        System.out.println("W "+totalPrice + "\n");

        System.out.println("1. 주문 \t2. 메뉴판");
        switch (scanner.nextInt()){
            case 1:
                System.out.println("주문이 완료되었습니다. 금액은 W "+totalPrice+" 입니다.");
                items.clear();
                break;
            case 2:
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }

    /**
     * 아이템을 장바구니에 추가하기
     * @param menuItem 추가할 아이템
     */
    void addItemToCart(MenuItem menuItem){
        items.add(menuItem);
        System.out.println(menuItem.getName() + "이 장바구니에 추가되었습니다.");
        System.out.println();
    }

    /**
     * 장바구니 비우기
     */
    void cancelCart(){
        items.clear();
        System.out.println("주문이 취소되었습니다.");
    }


}
