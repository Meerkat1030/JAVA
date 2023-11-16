package sec03.chap12.collection.arraylist;

import sec03.chap12.collection.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

  private ArrayList<Member> arrayList;

  public MemberArrayList(){
    arrayList = new ArrayList<Member>(); // 멤버 형으로 선언한 ArrayList 생성
  }

  // ArrayList에 회원등록 메소드
  public void addMember(Member member){
    arrayList.add(member);
  }

  // 회원 추가 메소드
  public void insertMember(Member member, int position){
    if(position < 0 || position > arrayList.size() +1){
      System.out.println("지정된 자리에 추가할 수 없습니다.");
      return;
    }
    arrayList.add(position -1, member);

  }

  // 회원삭제
    public boolean removeMember(int memberId){
  //    for(int i = 0 ; i < arrayList.size(); i++){
  //      Member member = arrayList.get(i);
  //      int tempId = member.getMemberId();
  //
  //      if(tempId == memberId){ // 회원 아이디가 매개변수와 일치하면
  //        arrayList.remove(i);  // 해당 회원을 삭제
  //        return true;
  //      }
  //    }

      Iterator<Member> ir = arrayList.iterator();
      while (ir.hasNext()){ // hasNext 메소드는 이후에 요소가 더 있는지 체크
                              // 요소가 있으면 true 반환
        Member member = ir.next(); // 다음 회원을 반환 받음
        int tempId = member.getMemberId();

        if(tempId == memberId){
          arrayList.remove(member);
          return true;
        }
      }
      // 끝날때 가지 삭제하려는 값을 못찾은 경우
      System.out.println(memberId + " 가 존재하지 않습니다.");
      return false;
    }

  // 전체회원 조회
  public void showAllMember(){
    for(Member member : arrayList){
      System.out.println(member);
    }
    System.out.println();
  }

}
