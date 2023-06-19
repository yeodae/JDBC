package day8;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String,Object> hong = new HashMap<>();

		hong.put("name","홍길동");
		hong.put("age",30);
		hong.put("addr","서울");
		hong.put("phone","010-1234-5678");

		//여러명을 관리하기 위해 ArrayList 활용
		ArrayList<HashMap<String,Object>> list =
				new ArrayList<>();
		list.add(hong);

		//System.out.println(hong);
		//={phone=010-1234-5678, name=홍길동, addr=서울, age=30}
		//출력값이 ArrayList Index:0번째에 들어간다.
		//List 안에있는 Map = ★json★(자주 많이 쓰인다.)
		
		for(int i=0; i<list.size(); i++){
			System.out.println("이름 : "+list.get(i).get("name") +"\n나이 : "+ list.get(i).get("age"));
		}
	}
}
