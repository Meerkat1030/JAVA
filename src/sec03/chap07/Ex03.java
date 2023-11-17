package sec03.chap07;

import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        HashMap<String, Integer> price = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        price.put("에스프레소", 2000);
        price.put("아메리카노", 2500);
        price.put("카푸치노", 3000);
        price.put("카페라떼", 3500);

        System.out.println("에스프레소, 카푸치노, 아메리카노, 카페라떼 있습니다.");

        while(true) {
            System.out.print("주문>>");
            String order=sc.next();
            if(order.equals("그만")) {
                break;
            }
            else {
                Integer p = price.get(order);
                if(p == null) {
                    System.out.println("그런 메뉴는 없습니다.");
                }else {
                    System.out.println(order + "는 " + p+"입니다.");
                }

            }
        }
    sc.close();
    }
}
