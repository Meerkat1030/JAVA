package sec03.chap01;

public class EqualsTest{
    public static void main(String[] args){
        String a = "JAVA";
        String b = "JAVA";
        String c = new String("JAVA");
        String d = new String("JAVA");
        //String으로 그냥 선언하면 같은 주소값을 바라보지만
        //new String으로 선언하면 새로운 객체에 선언한다.
        //즉, 값을 비교하고 싶다면 equals를 사용해야 한다.

        System.out.println( a == b );  // true
        System.out.println( b == c );  // false
        System.out.println( c == d );  // false

        System.out.println( a.equals(b) );  // true
        System.out.println( b.equals(c) );  // true
        System.out.println( c.equals(d) );  // true
    }
}