package sec03.chap03;
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하새요.");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("이름 : "+ name);
        String city = scanner.next();
        System.out.println("거주지 : "+city);
        int age = scanner.nextInt();
        System.out.println("나이 : "+age);
        double weight = scanner.nextDouble();
        System.out.println("몸무게 : "+weight);
        boolean single = scanner.hasNextBoolean();
        System.out.println("독신여부 : "+single);

        scanner.close();
    }
}
