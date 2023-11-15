package sec03.chap03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class temp2 {
    public static void main(String[] args) {

        //실습문제 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("알파벳 한 문자를 입력하세요>>");
//        String s = scanner.next();
//        char c = s.charAt(0);
//        for(int j = 97; j<=c; j++){
//            for(int i=j; i<=c; i++){
//                char a = (char)i;
//                System.out.print(a);
//            }
//            System.out.println();
//        }
//
        //실습문제 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("정수 10개 입력>>");
//        int intArray[] = new int[10];
//        for(int i=0; i<10; i++){
//            intArray[i] = scanner.nextInt();
//            if(intArray[i]%3 == 0){
//                System.out.print(intArray[i] + " ");
//            }
//        }

        //실습문제 5
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("정수 10개 입력>>");
//        int intArray[] = new int[10];
//        for (int i = 0; i < 10; i++) {
//            intArray[i] = scanner.nextInt();
//
//        }
//        for (int i = 0; i < intArray.length; i++) {
//            for (int j = i + 1; j < intArray.length; j++) {
//                if (intArray[i] > intArray[j]) {
//                    int temp = intArray[i];
//                    intArray[i] = intArray[j];
//                    intArray[j] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.print(intArray[i] + " ");
//        }
        // or
//        Arrays.sort(intArray);
//
//        for(int i : intArray){
//        System.out.print(i);
//        }

        //실습문제 6
        String eng[] = {"student", "love", "java", "happy", "future"};
        String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.print("영어 단어를 입력하세요>>");
            int i;
            String s = scanner.next();

            if(s.equals("exit")) break;

            for (i = 0; i < eng.length; i++) {
                if(s.equals(eng[i])) {
                    System.out.println(kor[i]);
                    break;
                }
                if(i == eng.length - 1) System.out.println("그런 영어 단어가 없습니다.");
            }
        }
        System.out.println("종료합니다...");
    }
}
