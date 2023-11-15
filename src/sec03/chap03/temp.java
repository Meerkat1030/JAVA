package sec03.chap03;

import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
// 실습문제 6
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("돈의 액수를 입력하세요>>");
//        int money = scanner.nextInt();
//        System.out.println(money);
//        int a = money/50000;
//        money -= a*50000;
//        int b = money/10000;
//        money -= b*10000;
//        int c = money/1000;
//        money -= c*1000;
//        int d = money/500;
//        money -= d*500;
//        int e = money/100;
//        money -= e*100;
//        int f = money/10;
//        money -= f*10;
//        int g = money/1;
//        money -= g*1;
//        System.out.println("50000: "+a+" 10000: "+b+" 1000:"+c);

// 실습문제 9
//        System.out.println("1~99 사이의 정수를 입력하세요.");
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int first = num/10;
//        int second = num%10;
//        if(num < 10){
//            if (num % 3 == 0) {
//                System.out.println("박수짝");
//            }
//            else{
//                System.out.println("박수없음");
//            }
//        }
//        else {
//            if(first%3==0&& second!=0){
//                if(second%3==0){
//                    System.out.println("박수짝짝");
//                }
//                else{
//                    System.out.println("박수짝");
//                }
//            } else if (first%3==0 || second%3==0) {
//                System.out.println("박수짝");
//            }
//            else{
//                System.out.println("박수없음");
//            }
//        }

        // 실습문제 10
        Scanner scanner = new Scanner(System.in);
        System.out.println("커피주문>>");
        String coffee = scanner.next();
        int cnt = scanner.nextInt();
        if(coffee.equals("에스프레소")){
            if(cnt>=10){
                System.out.println((2000*cnt)*0.95);
            }
            else{
                System.out.println(2000*cnt);
            }
        } else if (coffee.equals("아메리카노")) {
            System.out.println(2500*cnt);
        } else if (coffee.equals("카푸치노")) {
            System.out.println(3000*cnt);
        } else if (coffee.equals("카페라떼")) {
            System.out.println(3500*cnt);
        }
    }
}
