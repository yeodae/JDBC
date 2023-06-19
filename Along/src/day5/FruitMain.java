package day5;

public class FruitMain {//업캐스팅 예제
	//==========메서드=====Fruit타입의 매개변수f
	static void pack(Fruit f){ //과일 타입으로 업캐스팅
		//System.out.println(f.getName()+"과일을 담았습니다.");

		//문제: 1000원짜리 바나나를 담았습니다.
		//    2000원짜리 오렌지를 담았습니다.
		//    1500원짜리 사과를 담았습니다.
		int price=0;
		if(f instanceof Banana){//다운캐스팅
			Banana obj = (Banana)f;
			price = obj.getPrice();
		}
		if(f instanceof Orange){//다운캐스팅
			Orange obj = (Orange)f;
			price = obj.getPrice();
		}
		if(f instanceof Apple){//다운캐스팅
			Apple obj = (Apple)f;
			price = obj.getPrice();
		}
		System.out.println(price + "원짜리 " + f.getName()+"과일을 담았습니다.");
	}

	public static void main(String[] args) {

		Banana banana = new Banana("바나나","노란색",1000);
		Orange orange = new Orange("오렌지","주황색",2000);
		Apple apple = new Apple("사과","빨간색",1500);


		banana.view();
		orange.view();
		apple.view();

//		pack(banana);//업캐스팅
//		pack(orange);//업캐스팅
//		pack(apple);//업캐스팅


	}
}
