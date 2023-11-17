package sec03.chap12.map;

import sec03.chap12.collection.Member;

import java.util.HashSet;

public class Student {
    String studentId;
    String studentName;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student std){
            if(this.studentId == std.studentId){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    //중복제거
    @Override
    public int hashCode() {
        return Integer.parseInt(studentId);
    }


    @Override
    public String toString(){
        return studentId + ":" +studentName;
    }

}
