package sec03.chap03;

public class Ex05 {
    public static void main(String[] args) {
//        String str_b1 = "옛날에 호랑이가 한 마리 살았어요.";
//
//        //  💡 contains : 포함 여부
//        boolean bool_b1 = str_b1.contains("호랑이");
//        boolean bool_b2 = str_b1.contains("나무꾼");
//
//        //  💡 startsWith : (주어진 위치에서) 해당 문자열로 시작 여부
//        boolean bool_b3 = str_b1.startsWith("옛날에");
//        boolean bool_b4 = str_b1.startsWith("호랑이");
//        boolean bool_b5 = str_b1.startsWith("호랑이", 4);
//
//        //  💡 endsWith : 해당 문자열로 끝남 여부
//        boolean bool_b6 = str_b1.endsWith("살았어요.");
//        boolean bool_b7 = str_b1.endsWith("호랑이");
//
//        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
//
//        String str_c1 = "yalco@yalco.kr";
//        String str_c2 = "yalco.yalco.kr";
//        String str_c3 = "yalco@yalco@kr";
//
//        boolean bool_c1 = str_c1.matches(emailRegex);
//        boolean bool_c2 = str_c2.matches(emailRegex);
//        boolean bool_c3 = str_c3.matches(emailRegex);
        String str_a1 = "ABC";
        String str_a2 = "ABCDE";
        String str_a3 = "ABCDEFG";

        //  💡 compareTo : 사전순 비교에 따라 양수 또는 음수 반환

        //  같은 문자열이면 0 반환
        int int_a1 = str_a1.compareTo(str_a1);

        //  시작하는 부분이 같을 때는 글자 길이의 차이 반환
        int int_a2 = str_a1.compareTo(str_a2);
        int int_a3 = str_a1.compareTo(str_a3);
        int int_a4 = str_a2.compareTo(str_a3);
        int int_a5 = str_a3.compareTo(str_a1);

        String str_a4 = "HIJKLMN";

        //  시작하는 부분이 다를 때는 첫 글자의 정수값 차이 반환
        int int_a6 = str_a1.compareTo(str_a4);
        int int_a7 = str_a4.compareTo(str_a3);

        String str_b1 = "abc";
        String str_b2 = "DEF";

        int int_b1 = str_b1.compareTo(str_b2);

        //  💡 compareToIgnoreCase : 대소문자 구분 없이 비교
        int int_b2 = str_b1.compareToIgnoreCase(str_b2);

    }
}
