package day9_2;

import java.util.*;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest method = new MethodTest("ȫ�浿", 50, 65, 95);
		
		// result �޼��带 ȣ���ϸ� (method.result();)
		// name, list, arr 3���� ����
		HashMap<String,Object> map = method.result(); //HashMap ���ϵ�
		System.out.println(map.get("name"));
		System.out.println(map.get("list"));
		System.out.println(map.get("array"));
	}
}
