package sec03.chap13.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

    public static void main(String[] args) {
        TravelCustomer customer1 = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customer2 = new TravelCustomer("홍길동", 19, 100);
        TravelCustomer customer3 = new TravelCustomer("강감찬", 50, 100);

        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);

        // 1. 고객 명단을 출력
//        customerList.stream().forEach(s -> System.out.println(s));
        customerList.stream().map(c-> c.getName()).forEach(s -> System.out.println(s));

        // 2. 여행의 총 비용 계산
//        int totalCost = customerList.stream().mapToInt(c -> c.getPrice()).sum();
//        System.out.println("여행의 총 비용: " + totalCost);
        int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
        System.out.println("여행의 총 비용: " + total);

        // 3. 고객 중 20세 이상인 사람의 이름을 정렬 출력
//        customerList.stream()
//                .filter(c -> c.getAge() >= 20)
//                .sorted((c1, c2) -> c1.getName().compareTo(c2.getName()))
//                .forEach(c -> System.out.println(c.getName()));
        customerList.stream().filter(c->c.getAge() >= 20).map(c -> c.getName()).sorted()
                .forEach(s -> System.out.println(s));
    }
}