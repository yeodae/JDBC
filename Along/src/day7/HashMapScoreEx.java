package day7;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapScoreEx {

	public static void main(String[] args) {
		//사용자 이름과 점수를 기록하는 hashmap 컬렉션 생성
		HashMap<String,Integer> v = new HashMap<>();
		Scanner s = new Scanner(System.in);
		//5개의 점수 저장
		v.put("여대현",97);
		v.put("황정민",88);
		v.put("마동석",65);
		v.put("손석구",76);
		v.put("유아인",95);
		
		System.out.println("HashMap의 요소 개수 : "+v.size());
		
		while(true){
			System.out.println("해당 학생 성적보기, 나가기는 exit입력");
			String name = s.next();
			if(name.equals("exit")){
				System.out.println("종료합니다.");
				break;
			}
			if(v.containsKey(name)){
				System.out.println(v.get(name));
//			if(name.equals(v.get(name))){
//				v.get(name);
			}else
				System.out.println("잘못된 입력입니다.");
		}
	}

}
