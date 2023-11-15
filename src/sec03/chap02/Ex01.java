package sec03.chap02;

public class Ex01 {
    public static void main(String[] args) {
        double a = 0.1, b = 0.2;

        //  ⚠️ 오차가 생김
        double c = a + b;

        //  float의 최대값과 최소값
        float fMin = -Float.MAX_VALUE;
        float fMax = Float.MAX_VALUE;

        //  double의 최대값과 최소값
        double dMin = -Double.MAX_VALUE;
        double dMax = Double.MAX_VALUE;

        //  최소 절대값
        float fAbsMin = Float.MIN_VALUE;
        double dAbsMin = Double.MIN_VALUE;

        // ⭐ double이 범위도 넓고, 정밀도도 높음 확인
        boolean bool1 = Float.MAX_VALUE < Double.MAX_VALUE;
        boolean bool2 = Float.MIN_VALUE > Double.MIN_VALUE;

        //  최대 정밀도 테스트
        double dblNum = 0.123456789123456789;
        float fltNum = 0.123456789123456789f;

        float flt01 = 4.124f;
        float flt02 = 4.125f;
        double dbl01 = 3.5;

        // float끼리의 연산은 float 반환
        float flt03 = flt01 + flt02;

        //  float과 double의 연산은 double 반환
        //float flt04 = flt01 + dbl01; // ⚠️ 불가

        //  부동소수점 방식상 오차 자주 있음
        double dbl02 = 0.2 + 0.3f;
        double dbl03 = 0.2f * 0.7f;
        double dbl04 = 0.4 - 0.3;
        double dbl05 = 0.9f / 0.3;
        double dbl06 = 0.9 % 0.6;



    }
}

