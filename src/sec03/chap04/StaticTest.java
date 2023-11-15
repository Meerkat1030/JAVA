package sec03.chap04;
class Circle2{
    private int radius;
    public Circle2(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
class CircleManager{
    static void copy(Circle2 src, Circle2 dest){
        dest.setRadius(src.getRadius());
    }
    static boolean equals(Circle2 a, Circle2 b){
        if(a.getRadius() == b.getRadius()){
            return true;
        }
        else{
            return false;
        }
    }
}

public class StaticTest {
    public static void main(String[] args) {
        Circle2 pizza = new Circle2(5);
        Circle2 waffle = new Circle2(1);

        boolean res = CircleManager.equals(pizza, waffle);
        if(res==true){
            System.out.println("pizza와 waffle 크기 같음");
        }
        else {
            System.out.println("pizza와 waffle 크기 다름");
        }

        CircleManager.copy(pizza, waffle);
        res = CircleManager.equals(pizza, waffle);
        if(res==true){
            System.out.println("pizza와 waffle 크기 같음");
        }
        else {
            System.out.println("pizza와 waffle 크기 다름");
        }
    }
}
