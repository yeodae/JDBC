package day9_2;

import java.util.*;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest method = new MethodTest("홍길동", 50, 65, 95);
		
		// result 메서드를 호출하면 (method.result();)
		// name, list, arr 3개를 리턴
		HashMap<String,Object> map = method.result(); //HashMap 리턴됨
		System.out.println(map.get("name"));
		System.out.println(map.get("list"));
		System.out.println(map.get("array"));
	}
}
