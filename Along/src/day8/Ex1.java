package day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		Scanner s=new Scanner(System.in);

		for(int i=0; i<2; i++){
			HashMap<String, Object> v = new HashMap<>();
			System.out.println((i+1)+"번째 사용자 정보 입력");
			
			System.out.println("이름>>");
			v.put("name",s.next());
			System.out.println("나이>>");
			v.put("age",s.nextInt());
			System.out.println("성별>>");
			v.put("gender",s.next());
			System.out.println("주소>>");
			v.put("addr",s.next());
			list.add(v);//ArrayList i번째 배열에 입력
		}


		for(int i=0; i<list.size(); i++){
			System.out.print("이름 : "+list.get(i).get("name"));
			System.out.print(", 나이 : "+list.get(i).get("age"));
			System.out.print(", 성별 : "+list.get(i).get("gender"));
			System.out.print(", 주소 : "+list.get(i).get("addr"));
			System.out.println();
		}
//		HashMap<String, Object> map = list.get(i);
//		System.out.print("이름 : " + map.get("name"));
//		System.out.print(", 나이 : " + map.get("age"));
//		System.out.print(", 성별 : " + map.get("gender"));
//		System.out.print(", 주소 : " + map.get("addr"));
//		System.out.println();

	}

}
