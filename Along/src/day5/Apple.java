package day5;

public class Apple extends Fruit{
	private int price;

	Apple(String name,String color,int price){
		super(name,color);
		this.price=price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	void view(){
		super.view();
		System.out.println(" <== 사과는 빨개");
		
		System.out.println("\"홍길동\"");//이스케이프문 연습 \"
		System.out.println("\"\\n은 줄바꿈 이다.\"");
	}
}
