package day5;

public class Fruit {
	private String name;
	private String color;

	Fruit(String name, String color){
		this.name = name;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	void view(){
		System.out.print("Á¾·ù : "+name+" »ö±ò : "+color);
	}
}

