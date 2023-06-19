package day7_extends;

public class Student extends Person{
	void study(){
		System.out.println("공부하기");
	}
	@Override
	void eat(){
		System.out.println("급식을 먹습니다");
	}
	void info(){
		System.out.println("학생 입니다.");
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.say();
		s.eat();
		s.walk();
		s.sleep();
		s.study();
	}
	
	
	
}
