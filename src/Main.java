//클래스 범위
public class Main {
    //메서드
    public static void main(String[] args) {
        //명령문
        byte a = 111;
//        byte a = 111; // java 정적 자료형 재선언 불가능
        a = 20; // 재할당은 가능
        // 처음 선언할 때의 자료형이 달라질수 없다
//        ex) a = true; 불가능
        short b = 3276;
        int c = 1239235234;

        char ch1, ch2, ch3; // 선언을 한번에 할 수 있다
        char ch4='A', ch5='B';
        System.out.println(ch4);

        //System.out.println(ch1); 초기화전에는 사용 불가능
        ch1 = 'S';
        System.out.println(ch1);

        String e = "문자열";
        
        final int NUMBER = 1;
//        NUMBER = 2; final로 선언한 변수는 값 변경 불가능 & final변수명은 대문자로

        //정수 리터럴
        int n = 15;     //10진수
        int m = 0x15;   //16진수
        int b1 = 0b0101; //2진수
        long g = 24L;   //정수 리터럴을 long 타입으로 지정하고자 하면 숫자뒤에 'L', 'l'을 붙여야 한다.

        //실수 리터럴
        double s = 12.0;
        double d = 0.1234;
        double h = 1234E-4; // 123 * 10의 -4승 E는 지수를 뜻한다
        double j = 1234E+4; // 123 * 10의 +4승
        float f = 0.1234f; // 'f' 'F'를 붙이면 float타입으로 강제 변환

        //문자 리터럴
        char aa = 'W';
        char bb = '글';
        char cc = '\uae00'; //'글'이라는 글자의 유니코드값
        System.out.println(aa);

        //논리 타입 리터럴
        boolean aaa = true;
        boolean bbb = 10 > 0;
        while(true); // if문이나 while 문 등에 사용된다.
    }
}