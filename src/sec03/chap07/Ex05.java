package sec03.chap07;

import java.util.*;

public class Ex05 {
    public static void main(String[] args) {
        HashMap<String, Integer> nations = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("나라 이름과 인구를 5개 입력하세요.");
        for(int i=0;i<5;i++) {
            System.out.print("나라 이름, 인구 >>");
            nations.put(sc.next(),sc.nextInt());
        }

        Set<String> keys = nations.keySet();
        Iterator<String> it = keys.iterator();
        String maxNations = "";
        int maxPe = 0;
        while(it.hasNext()){
            String n = it.next();
            int p = nations.get(n);
            if(maxPe < p){
                maxNations = n;
                maxPe = p;
            }
        }
        System.out.println(maxNations + maxPe);
    }
}
