package sec03.chap03;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int low, high;
        int card;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);


        while(true){
            int i = 0;
            low = 0;
            high = 99;
            card = r.nextInt(100);//0~99까지의 랜덤 수 만들어준다.
            System.out.println("Up&Down 게임입니다. 숨겨진 수를 맞추어 보세요");


            while(true){
                System.out.println(low + "-" + high);
                System.out.print(i + ">>");
                int j = 0;
                try{
                    j = sc.nextInt();

                }
                catch(InputMismatchException e){
                    System.out.println("정수가 아님 다시 입력");
                    sc.nextLine();
                    continue;
                }
                if(j<low || j>high){
                    System.out.println("범위를 벗어남");
                }
                else{
                    if(j<card){
                        System.out.println("더 높게");
                        low = j;
                        i++;

                    } else if (j>card) {
                        System.out.println("더 낮게");
                        high = j;
                        i++;

                    }
                    else if(j == card){
                        System.out.println("맞았습니다.");
                        break;
                    }
                }
            }
            System.out.println("다시하시겠습니까? (y/n)>>");
            if(sc.next().equals("n")){
                break;
            }
        }
        sc.close();
    }
}
