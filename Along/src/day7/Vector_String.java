package day7;

import java.util.Vector;

public class Vector_String {
	public static void main(String[] args) {
		Vector<String> s = new Vector<>();
		
		s.add(new String("홍길동"));
		s.add("유재석");//new String 생략가능
		s.add("강호동");
		
		System.out.println("객체 내 요소 갯수 : "+s.size());
		
		s.add(2,"박명수"); //중간요소 추가
		s.remove("홍길동"); //요소값 삭제
		
		
		for(int i=0; i<s.size(); i++){
//			String p = s.get(i);
//			System.out.println(p);
			System.out.println(s.get(i));
		}

	}

}
