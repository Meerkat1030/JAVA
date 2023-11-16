package sec03.chap11;



class Student{
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return studentId + ", " + studentId;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student std = (Student) obj;
            //재정의한 equals 메소드는 학번이 같으면 같다고 인정
            if(this.studentId == std.studentId){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        Student student1 = new Student(100, "이상원");
        Student student2 = student1;

        Student student3 = new Student(100, "이상원");

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));

        if(student1 == student2){
            System.out.println("student1 과 student2의 주소가 같습니다.");
        }else {
            System.out.println("student1 과 student2의 주소가 다릅니다..");
        }

        if(student1.equals(student2)){
            System.out.println("student1 과 student2는 동일합니다.");
        }else {
            System.out.println("student1 과 student2는 다릅니다..");
        }

        if(student1 == student3){
            System.out.println("student1 과 student3의 주소가 같습니다.");
        }else {
            System.out.println("student1 과 student3의 주소가 다릅니다..");
        }

        if(student1.equals(student3)){
            System.out.println("student1 과 student3는 동일합니다.");
        }else {
            System.out.println("student1 과 student3는 다릅니다..");
        }
    }

}
