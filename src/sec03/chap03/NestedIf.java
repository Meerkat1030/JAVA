package sec03.chap03;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수입력(0~100)");
        int score = scanner.nextInt();
        System.out.println("학년입력");
        int year = scanner.nextInt();
        
        if(score >= 60){
            if(year != 4)
                System.out.println("합격");
            else if (score >= 70) {
                System.out.println("합격");
            }
            else
                System.out.println("불합격");
        }
        else
            System.out.println("불합격");
    }
}
