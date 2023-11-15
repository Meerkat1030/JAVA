package sec03.chap06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String str = sc.nextLine();
            if(str.equals("exit")){
                System.out.println("종료합니다...");
                break;
            }else{
                StringTokenizer st=new StringTokenizer(str," ");
                int cnt=st.countTokens();
                System.out.println("어절 개수는 "+cnt);
            }
        }
        sc.close();
    }
}
