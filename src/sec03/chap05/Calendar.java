package sec03.chap05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Calendar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = 0, m = 0, d = 0, w = 0, i = 0, j = 0; //y년도, m월, d일, i변수
        boolean cal = false;
        int monthSet[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//각월마다 총일수
        int no = 0;
        int user[] = new int[9999];

        do {
            System.out.print("연도를 입력하세요 : ");
            y = sc.nextInt()+1;
//   user[i] = y;
            if (y < 1 || y > 9999) {
                System.out.println("숫자는 1~9999 사이의 숫자만 입력가능합니다.");
                continue;
            }

            for (m = 1; m <13; m++) {//12대신 d
                System.out.println("        <<" + m +"월>>");


                // 1. 시작 : 윤년 계산
                if(y % 4 ==0 && y % 100!=0 || y % 400 ==0)
                    monthSet[1]=29; //윤년이면 2월은 29일
                else
                    monthSet[1]=28; //윤년이 아니면 2월은 28일


                //2. 0년  1월 1일은 일요일
                d = (y-1)*365 + (y-1)/4 -(y-1)/100 + (y-1)/400;

                //y년 전날까지 날수
                for(i=0; i<m-1; i++){
                    d = d + monthSet[i];
                }
                w = d % 7; //구하고자 하는 달의 시작일(1일)의 요일을 구함
                d = d + 1;

                System.out.println("  일   월  화   수  목  금   토");

                //    공백
                for(i=0;i<w;i++) {
                    System.out.print("    ");
                }//날짜 출력
                for(i=1; i <= monthSet[m-1]; i++) {
                    System.out.printf("%4d", i);
                    //한주의 날짜가 출력되면 줄바꿈 처리
                    w++;
                    if(w %7 == 0)
                        System.out.println();
                }
                if(w % 7 != 0) {
                    System.out.println();
                }
            }
        }while(y>0);
    }
}
