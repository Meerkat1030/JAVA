package sec03.chap07;

import java.util.ArrayList;
import java.util.Scanner;

class Location{
    private int x, y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Location l){
        double d = (this.x - l.x)*(this.x - l.x) + (this.y - l.y)*(this.y - l.y);
        return Math.sqrt(d);
    }
}

public class Ex07 {
    public static void main(String[] args) {
        ArrayList<Location> travel = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        travel.add(new Location(0,0));
        System.out.println("쥐가 이동한 위치(x,y)를 5개 입력하라.");
        for(int i=0; i<5; i++){
            System.out.println(">>");
            int x = sc.nextInt();
            int y = sc.nextInt();
            travel.add(new Location(x,y));
        }
        travel.add(new Location(0,0));

        double sum = 0.0;
        for(int i =0; i< travel.size()-1; i++){
            double d = travel.get(i).distance(travel.get(i+1));
            sum += d;
        }
        System.out.println("총 이동 거리는 " + sum);
        sc.close();
    }

}
