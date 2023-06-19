package day4_test;

public class ColorTV extends TV {
	private int color;//전역변수
	
	public ColorTV(int size,int color) {//생성자
		super(size);
		this.color=color;
	}
	protected int getColor(){
		return color;
	}
	public void printProperty(){
		System.out.println(getSize()+"인치 "+getColor()+"컬러 TV");
	}
}
//결과 : 32인치 1024컬러