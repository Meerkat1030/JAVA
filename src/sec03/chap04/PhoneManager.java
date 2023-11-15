package sec03.chap04;

import java.util.Scanner;

class Phone{
    private String name, tel;

    public Phone(String name, String tel){
        this.name = name;
        this.tel = tel;
    }
    public String getTel(){
        return tel;
    }
    public String getName(){
        return name;
    }
}
public class PhoneManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원수>>");
        int person = scanner.nextInt();
        Phone[] phone = new Phone[person];

        for(int i= 0;i< person; i++){
            System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
            phone[i] = new Phone(scanner.next(), scanner.next());
        }
        System.out.println("저장되었습니다...");
        while(true) {
            System.out.print("검색할 이름>>");
            String name = scanner.next();
            String tel = "";

            if(name.equals("exit")) {
                System.out.println("프로그램을 종료합니다...");
                scanner.close();
                System.exit(0);
            }

            else {
                for(int i=0; i<person; i++) {
                    if(name.equals(phone[i].getName()))
                        tel = phone[i].getTel();
                }
            }

            if(tel=="") {
                System.out.println(name+"이 없습니다.");
            }
            else {
                System.out.println(name + "의 번호는 " + tel + " 입니다.");
            }
        }
    }
}
