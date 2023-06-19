package collection.hashset;

import java.util.*;
import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	//HashSet ����
	
	public MemberHashSet(){
		hashSet = new HashSet<Member>();
		//HashSet ����
	}
	
	public void addMember(Member member){
		hashSet.add(member);
	}//HashSet�� ȸ���߰�
	
	public boolean removeMember(int memberId){
		Iterator<Member> ir = hashSet.iterator();
		
		while(ir.hasNext()){//ȸ���� �ϳ��� �����ͼ�
			Member member = ir.next();//���̵� ��
			int tempId = member.getMemberId();
			//���̵� ��
			if(tempId == memberId){//���� ���̵��� ���
				hashSet.remove(member);//ȸ�� ����
				return true;
			}
		}
		System.out.println(memberId + "�� ���� ���� �ʽ��ϴ�.");
		return false;
		}
		public void showAllMember(){//��� ȸ�� ���
			for(Member member : hashSet){
				System.out.println(member);
			}
			System.out.println();
	}
}
