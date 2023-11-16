package sec03.chap12.collection;

public class Member {
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    @Override
    public int hashCode(){
        return memberId;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member){
            Member member = (Member) obj;
            //매개변수로 받은 회원 ID가 자신의 회원 ID와 같으면
            //true 반환
            if(this.memberId == member.memberId){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    @Override
    public String toString(){
        return memberName + "회원님의 아이디는 " + memberId + "입니다.";
    }
}
