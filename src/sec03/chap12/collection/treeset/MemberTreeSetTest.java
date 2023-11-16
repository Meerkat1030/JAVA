package sec03.chap12.collection.treeset;

import sec03.chap12.collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member member1 = new Member(1003, "강감찬");
        Member member2 = new Member(1002, "이순신");
        Member member3 = new Member(1001, "홍길동");

        memberTreeSet.addMemder(member1);
        memberTreeSet.addMemder(member2);
        memberTreeSet.addMemder(member3);

        memberTreeSet.showAllMember();

        Member member4 = new Member(1003, "을지문덕");
        memberTreeSet.addMemder(member4);

        memberTreeSet.showAllMember();
    }
}
