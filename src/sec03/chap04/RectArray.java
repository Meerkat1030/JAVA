package sec03.chap04;

import java.util.Scanner;
class Rect {
    private int width, height;
    public Rect(int width, int height){
        this.width = width;
        this.height = height;
    }
    public int getArea(){
        return width * height;
    }
}

public class RectArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rect[] arr = new Rect[4];
        int sum = 0;
        int i;

        for(i=0; i<4; i++)
        {
            System.out.print((i+1) + " 너비와 높이 >>");
            arr[i] = new Rect(sc.nextInt(), sc.nextInt());
            sum += arr[i].getArea();
        }

        System.out.println("저장하였습니다...\n");
        System.out.print("사각형의 전체 합은 " + sum);
        sc.close();
    }


}
