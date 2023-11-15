package sec03.chap12.collection.arraylist;

import sec03.chap12.collection.Member;

import java.util.ArrayList;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList(){
        arrayList = new ArrayList<Member>();
    }
//    ArrayList에 회원 추가 메소드
    public void addMember(Member member){
        arrayList.add(member);
    }
//    회원 삭제
    public boolean removeMember(int memberId){
        for(int i=0; i<arrayList.size(); i++){
            Member member = arrayList.get(i);
            int tempId = member.getMemberId();

            if(tempId == memberId){ //회원 아이디가 매개변수와 일치하면
                arrayList.remove(i); // 해당 회원을 삭제
                return true;
            }
        }
        System.out.println(memberId+"가 존재하지 않습니다.");
        return false;
    }
    public void insertMember(int position, Member member){
        if(position < 0 || position > arrayList.size() +1){
            System.out.println("여기는 데이터를 넣을 수 없습니다.");
        }
            arrayList.add(position, member);


//        if(position < arrayList.size() && position > 0){
//        }else if(position == arrayList.size()+1){
//            arrayList.add(member);
//        }else if(position < 0){
//            System.out.println("0보다 커야 합니다.");
//        } else{
//        }
    }
//    전체 회원 조회
    public void showAllMember(){
        for(Member member : arrayList){
            System.out.println(member);
        }
        System.out.println();
    }
}
