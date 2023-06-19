package collection;
import java.util.*;
public class Member implements Comparable {
	private int memberId;
	private String memberName;
	
	public Member(int memberId,String memberName) {
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
	public String toString(){
		return memberName + "ȸ������ ���̵��" + memberId + "�Դϴ�.";
	}
	
	@Override
	public int hashCode(){
		return memberId;//hashCode() �޼��尡 ȸ�� ���̵� ��ȯ�ϵ��� ������
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Member){
			Member member = (Member)obj;
			if(this.memberId == member.memberId)
				return true;
				else
				return false;
			}
			
			return false;
			}
	
	@Override
	public int compareTo(Member member){
		return (this.memberId - member.memberId);   //��������
		//return (this.memberId - member.memberId) *  (-1);   //���� ����
}
}
