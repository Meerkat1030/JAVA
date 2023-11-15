package sec03.chap06;

import java.util.*;

public class Ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = (int) (Math.random() * 3 + 1);
            int b = (int) (Math.random() * 3 + 1);
            int c = (int) (Math.random() * 3 + 1);
            System.out.println(a + " " + b + " " + c);
            if (a == b && b == c && a == c) {
                System.out.println("성공");
                break;
            }
        }
        sc.close();

    }
}
