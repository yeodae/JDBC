package collection.hashset;

import java.util.*;
import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	//HashSet 선언
	
	public MemberHashSet(){
		hashSet = new HashSet<Member>();
		//HashSet 생성
	}
	
	public void addMember(Member member){
		hashSet.add(member);
	}//HashSet에 회원추가
	
	public boolean removeMember(int memberId){
		Iterator<Member> ir = hashSet.iterator();
		
		while(ir.hasNext()){//회원을 하나씩 가져와서
			Member member = ir.next();//아이디 비교
			int tempId = member.getMemberId();
			//아이디 비교
			if(tempId == memberId){//같은 아이디인 경우
				hashSet.remove(member);//회원 삭제
				return true;
			}
		}
		System.out.println(memberId + "가 존재 하지 않습니다.");
		return false;
		}
		public void showAllMember(){//모든 회원 출력
			for(Member member : hashSet){
				System.out.println(member);
			}
			System.out.println();
	}
}
