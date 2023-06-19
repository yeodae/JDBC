package day2;

public class CircleMain {

	public static void main(String[] args) {
		Circle pizza = new Circle(); // Circle 객체 생성
		pizza.radius = 10; // 피자의 반지름을 10으로 설정
		pizza.name = "자바피자"; // 피자의 이름 설정
		System.out.println(pizza.name+pizza.radius);

		double area = pizza.getArea(); // 피자의 면적 알아내기
		//위에있는 리턴값 area에 저장 return 3.14 * radius * radius;
		System.out.println(pizza.name + "의 면적은 " + area);
		//리턴값받은 area 호출


		Circle donut = new Circle(); // Circle 객체 생성
		donut.radius = 2; // 도넛의 반지름을 2로 설정
		donut.name = "자바도넛"; // 도넛의 이름 설정
		area = donut.getArea(); // 도넛의 면적 알아내기
		System.out.println(donut.name + "의 면적은 " + area);


	}

}
