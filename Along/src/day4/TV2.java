package day4;

public class TV2 {
	private int size;

	TV2(){
		System.out.println("TV2 기본생성자");
	}
	TV2(int size){
		this.size=size;
		System.out.println("TV2 파라미터 생성자");
	}
	
	void setSize(int size){
		this.size = size;
	}
	int getSize(){
		return size;
	}
}
