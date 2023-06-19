package day4;

import day3.ClassA;//외부 패키지 호출

public class Sample1 extends ClassA{

//	public static void main(String[] args) {
//		ClassA classa = new ClassA();//외부 패키지 사용할땐 import 사용
//	}
	void test(){//상속받아서 main이 필요없다.
		a=100;
//		b=200;//디폴트 내부패키지라 접근불가.
		c=300;//protected는 상속관계에서 사용 가능하다.
//		d=400;//private 접근불가.
	}
}
