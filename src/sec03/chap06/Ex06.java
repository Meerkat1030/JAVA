package sec03.chap06;

import java.util.*;

public class Ex06 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.print("가위(1), 바위(2), 보(3), 끝내기(4) >>");
            int user=sc.nextInt();
            int com=(int)(Math.random()*3+1);

            if(user==4) {
                System.out.println("게임종료");
                break;
            }
            switch(user) {
                case 1:{ //사용자가 가위 낸 경우
                    System.out.print("사용자 가위 : ");
                    if(com==1) {
                        System.out.println("컴퓨터 가위\n비겼습니다.");
                    } else if(com==2) {
                        System.out.println("컴퓨터 바위\n사용자가 졌습니다.");
                    } else {
                        System.out.println("컴퓨터 보\n사용자가 이겼습니다.");
                    }
                    break;
                }
                case 2:{//사용자가 바위 낸 경우
                    System.out.print("사용자 바위 : ");
                    if(com==2) {
                        System.out.println("컴퓨터 바위\n비겼습니다.");
                    } else if(com==3) {
                        System.out.println("컴퓨터 보\n사용자가 졌습니다.");
                    } else {
                        System.out.println("컴퓨터 가위\n사용자가 이겼습니다.");
                    }
                    break;
                }
                case 3:{ //사용자가 보를 낸 경우
                    System.out.print("사용자 보 : ");
                    if(com==3) {
                        System.out.println("컴퓨터 보\n비겼습니다.");
                    } else if(com==1) {
                        System.out.println("컴퓨터 가위\n사용자가 졌습니다.");
                    } else {
                        System.out.println("컴퓨터 주먹\n사용자가 이겼습니다.");
                    }
                    break;
                }
            }
        }
        sc.close();
    }
}