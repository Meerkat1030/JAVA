package sec03.chap01;

public class Ex03 {

    public static void main(String[] args) {
        int a = 1;
        a = a + 2;

        a += 3; // 🔴

        // 값을 반환하기도 함
        int b = a += 4; // 🔴


        int x = 3;
        x += 2;
        x -= 3; // 🔴
        x *= 12;
        x /= 3;
        x %= 5;

        // 💡 자료형의 범위를 넘어가도록 숫자를 더하거나 뺄 경우
        byte xx = 127;
        xx += 1;

        byte yy = -128;
        yy -= 1;

        int int1 = 3;

        int int2 = int1++; // 🔴
        int int3 = ++int1;
        int int4 = -(int2-- * --int3);

        int xxx = 1;

        //  메서드 안으로도 '반환'되어 사용되는 것
        System.out.println(xxx++);
        System.out.println(++xxx);
        System.out.println(xxx);


        //  ⚠️ 리터럴에는 사용 불가
//        int int5 = 3++;
//        int int6 = --3;
    }
}
