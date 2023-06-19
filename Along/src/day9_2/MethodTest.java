package day9_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MethodTest {
	String name;
	ArrayList<Integer> list;
	int arr[];

	MethodTest(String name, int java, int oracle, int html){
		this.name=name;
		
		list = new ArrayList<Integer>();
		list.add(java);
		list.add(oracle);
		list.add(html);
		
		arr = new int[3];
		arr[0] = java;
		arr[1] = oracle;
		arr[2] = html;
	}
	
	HashMap<String,Object> result(){
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("name",name);
		map.put("list",list);
		map.put("array",arr);
		return map;
	
	}	
}
