package sec03.chap12.collection.arraylist;

import sec03.chap12.collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

//        새로운 회원 인스턴스 생성
        Member memberLee = new Member(1001, "이지원");
        Member memberKim = new Member(1002, "김민수");
        Member memberSon = new Member(1003, "손흥민");
        Member memberHong = new Member(1004, "홍박사");
//        memberArrayList.addMember(new Member(1001, "이지원"));

//        ArrayList 회원 추가
        memberArrayList.addMember((memberLee));
        memberArrayList.addMember((memberKim));
        memberArrayList.addMember((memberSon));
        memberArrayList.addMember((memberHong));

//        전체 회원 출력
        memberArrayList.showAllMember();
//        손흥민 삭제
        memberArrayList.removeMember(memberSon.getMemberId());
//        삭제 후 전체 회원 출력
        memberArrayList.showAllMember();

        //ArrayList 특정 위치에 회원추가하는 메소드를 작성
        //회원 추가할 때 맨뒤가 아니라 특정위치에 추가하는 메소드를 만들고
        //insertMember 메소드 파라미터 Member int position
        //position < 0
        //arraySize 현재 4 5 가능 6 7불가능
        memberArrayList.insertMember(1, new Member(1005, "이강인"));
        memberArrayList.insertMember(8, new Member(1006, "황희찬"));
        memberArrayList.insertMember(5, new Member(1007, "김민재"));
        memberArrayList.insertMember(4, new Member(1008, "조규성"));



        memberArrayList.showAllMember();
    }
}
