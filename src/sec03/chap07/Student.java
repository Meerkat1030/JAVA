package sec03.chap07;

import java.util.ArrayList;

public class Student {
    int StudentID;
    String studentName;

    ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName) {
        this.StudentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }

    //학생 정보를 출력하는 메소드
    public void showStudentInfo(){
        int total = 0;
        for(Subject s : subjectList){
            total += s.getScore();
            System.out.println("학생 " + studentName + "의 " + s.getName() + "성적은 " + s.getScore() + "입니다.");
            System.out.println("학생 " + studentName + "의 총점은 " + total + "입니다." );
        }
    }
}
