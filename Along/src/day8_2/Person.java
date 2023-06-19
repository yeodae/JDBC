package day8_2;

import java.util.Map;

public class Person {
	private String name;
	private int age;
	private String addr;
	
	public Person(String name,int age,String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddr() {
		return addr;
	}
	
	
}
