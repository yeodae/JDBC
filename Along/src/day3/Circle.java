package day3;

public class Circle {
	int radius;
	String name;
	
	Circle(){
		System.out.println("기본 생성자 호출");
	}
	Circle(int radius){
		this.radius=radius;
	}
	Circle(int r, String n){
		radius = r;
		name = n;
		System.out.println("매개변수 생성자 호출");
	}
}
//생성자의 목적은 객체초기화 : 객체가 생성될때 호출된다.
//여러개 작성가능 : 오버로딩이 가능하다.
