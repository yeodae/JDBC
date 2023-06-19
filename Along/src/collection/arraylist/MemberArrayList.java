package collection.arraylist;

import java.util.ArrayList;
import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	//Arraylist선언
	public MemberArrayList(){
		arrayList = new ArrayList<Member>();
		//member형으로 선언한 ArrayList 생성
	}
	
	public void addMember(Member member){
		arrayList.add(member);
	}//리스트에 회원을 추가하는 메서드
	
	public void insertMember(Member member, int position) {
		if(position <0 || position > arrayList.size()+1) {
			System.out.println("지정 된 자리에 추가할 수 없습니다");
			return;
		}
		arrayList.add(position-1, member);
	}
	
	
	public boolean removeMember(int memberId){
		for(int i=0; i<arrayList.size(); i++){
			Member member = arrayList.get(i);
			//get 메서드로 회원을 순차적으로 가져옴
			int tempId = member.getMemberId();
			if(tempId == memberId){
				//회원 아이디가 매개변수와 일치하면
				arrayList.remove(i);
				//해당 회원을 삭제
				return true;
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;//반복문이 끝날때까지 아이디를 찾지 못한경우
	} //해당 아이디를 가진 회원을 arraylist에서 찾아 제거함.
	
	public void showAllMember(){ //전체 회원을 출력하는 메서드
		for(Member member : arrayList){
			System.out.println(member);
		}
		System.out.println();
	}
}
