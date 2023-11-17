package sec03.chap07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Character>grade=new ArrayList<Character>();

        System.out.print("빈 칸으로 분리하여 5개의 학점을 입력(A/B/C/D/F)>>");
        for(int i=0;i<5;i++) {//성적 5개 입력
            String string=sc.next();
            char alpha=string.charAt(0);
            grade.add(alpha);
        }

        for(int i=0;i<grade.size();i++) {
            if(grade.get(i)=='A') {
                System.out.print(4.0);
            }
            else if(grade.get(i)=='B') {
                System.out.print(3.0);
            }
            else if(grade.get(i)=='C') {
                System.out.print(2.0);
            }
            else if (grade.get(i)=='D') {
                System.out.print(1.0);
            }
            else if(grade.get(i)=='F') {
                System.out.print(0.0);
            }
            else {
                System.out.print("잘못된 입력입니다.");
            }
            System.out.print(" ");
        }
        sc.close();
    }
}
