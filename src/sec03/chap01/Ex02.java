package sec03.chap01;

public class Ex02 {
    public static void main(String[] args) {
        int a = 1 + 2;
        int b = a - 1;
        int c = b * a;
        int d = a + b * c / 3;
        int e = (a + b) * c / 3;
        int f = e % 4;



        byte b1 = 1;
        byte b2 = 2;
        short s1 = 1;
        short s2 = 2;

        //  ⚠️ 아래는 모두 불가
//        byte b3 = b1 + b2;
//        short s3 = b1 + b2;
//        short s4 = b1 + s2;
//        short s5 = s1 + s2;

        //  ⭐ byte와 short의 연산들은 int 반환
        //  int를 많이 쓰는 이유 중 하나
        int i1 = b1 + b2;
        int i2 = s1 + s2;
        int i3 = b1 + s1;

        long l1 = 1;
        long l2 = 2;

        // long끼리의 연산은 long 반환
//        int l3 = l1 + l2;

        //  ⚠️ 정수 자료형의 계산은 소수점 아래를 '버림'
        byte int1 = 5/2;
        int int2 = 10;
        int int3 = 3;
        int int4 = int2 / int3;
    }
}
