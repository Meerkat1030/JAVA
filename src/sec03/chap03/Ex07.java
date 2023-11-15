package sec03.chap03;

public class Ex07 {
    public static void main(String[] args) {
        //  💡 concat : 문자열을 뒤로 이어붙임
        String str_a1 = "슉-";
        String str_a2 = "슈슉-";
        String str_a3 = "슈슈슉-";

        String str_a4 = str_a1 + str_a2 + str_a3;

        String str_a5 = str_a1.concat(str_a2);

        //  ⭐️ 메서드 체이닝
        String str_a6 = str_a1
                .concat(str_a2)
                .concat(str_a3)
                .concat(str_a4)
                .concat(str_a5);


        //  ⭐️ + 연산자와의 차이

        String str_b1 = "ABC";

        //  1. concat에는 문자열만 이어붙일 수 있음
        String str_b2 = str_b1 + true + 1 + 2.34 + '가';
        String str_b3 = str_b1
                //  .concat(true)
                //  .concat(1)
                //  .concat(2.34)
                //  .concat('가')
                ;

        //  2. concat은 필요시에만 새 인스턴스 생성 (큰 의미 없음)
        String str_b4 = str_b1 + "";
        String str_b5 = str_b1.concat("");

        int str_b1Hash = System.identityHashCode(str_b1);
        int str_b4Hash = System.identityHashCode(str_b4);
        int str_b5Hash = System.identityHashCode(str_b5);

        //  3. null이 포함될 경우
        String str_c1 = null;

        //  + 연산자는 null과 이어붙이기 가능
        String str_c3 = str_c1 + null + "ABC";

        //  ⚠️ concat은 NullPointerException 발생
        //String str_c4 = str_c1.concat("ABC");
        //String str_c5 = "ABC".concat(str_c1);
    }
}
