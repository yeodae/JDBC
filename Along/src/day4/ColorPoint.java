package day4;

public class ColorPoint extends Point{
	private String col;
	
	void setColor(String col){
		this.col=col;
	}
	
	void showColorPoint(){
		System.out.print(col);
		showPoint();
	}
}
