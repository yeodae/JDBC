package day6_2;

//equals 예제 
public class Rect {
	private int width;
	private int height;

	public Rect(int width,int height){
		this.width=width;
		this.height=height;
	}

	public boolean equals(Object obj){//업캐스팅
		Rect p = (Rect)obj;//다운캐스팅 필수.
		if(width*height ==(p.width*p.height)){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		Rect r1 = new Rect(2,3); // 변수 초기화.
		Rect r2 = new Rect(3,2);
		Rect r3 = new Rect(3,4);
		if(r1.equals(r2))
		System.out.println("r1 is equal to r2");
		if(r1.equals(r3))
		System.out.println("r1 is equal to r3");
		if(r2.equals(r3))
			System.out.println("r2 is equal to r3");
	}
}
