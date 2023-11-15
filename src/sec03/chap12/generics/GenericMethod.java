package sec03.chap12.generics;

public class GenericMethod {
    //제네릭 메서드
    public static <T,V> double makeRectangle(Point<T,V>p1,Point<T,V>p2){
        double left = ((Number)p1.getX()).doubleValue();
        double top = ((Number)p1.getY()).doubleValue();

        double right = ((Number)p2.getX()).doubleValue();
        double bottom = ((Number)p2.getY()).doubleValue();

        double width = right - left;
        double height = bottom - top;

        return width * height;
    }
    public static void main(String[] args) {
        Point <Integer, Double> p1 = new Point<>(0, 0.0);
        Point <Integer, Double> p2 = new Point<>(10, 10.0);

        double reat = GenericMethod.<Integer, Double>makeRectangle(p1,p2);

        System.out.println("두 점으로 만들어진 사각형의 넓이는 " + reat +"입니다.");
    }
}
