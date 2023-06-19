package day4;

public class ColorTV extends TV2 {
	private int color;
	
	ColorTV(){
		System.out.println("ColorTV 기본생성자");
	}
	ColorTV(int size, int color){
		super(size);
		System.out.println("ColorTV 파라미터 생성자");
	}
	
	void setColor(int color){
		this.color=color;
	}
	int getColor(){
		return color;
	}
	void printProperty(){
		System.out.println(getSize()+"인치"+getColor()+"컬러");
	}
}
