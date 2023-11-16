package sec03.chap12.collection.hashset;

import sec03.chap12.collection.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet; // hashSet 선언
    public MemberHashSet(){
        hashSet = new HashSet<Member>(); // hashset 생성
    }

    public void addMember(Member member){
        hashSet.add(member);
    }
    public boolean removeMember(int memberId){
        Iterator<Member> ir = hashSet.iterator();

        while(ir.hasNext()){
            Member member = ir.next();
            int tempId = member.getMemberId();
            if(tempId == memberId){
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + " 아이디가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for(Member member : hashSet){
            System.out.println(member);
        }
    }
}
