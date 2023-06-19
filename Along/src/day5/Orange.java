package day5;

public class Orange extends Fruit{
	private int price;

	Orange(String name,String color,int price){
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
		System.out.println(", АЁАн : "+getPrice());
	}
}
