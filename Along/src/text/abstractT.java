package text;
//혼합형 추상클래스

abstract class TT{//추상클래스
	int age;//전역변수
	
	public TT(){}//디폴트생성자
	
	public TT(int age){//인자있는 생성자
		this.age = age;
	}
	
	public void kk(){//일반메서드
		System.out.println("kk 일반메서드 호출");
	}
	public abstract void disp();//추상메서드
	
	//메서드
}


public class abstractT extends TT{
	public abstractT(int age){
		super(age);
	}
 
@Override
public void disp() {//추상메서드 오버라이딩
	System.out.println("disp() 추상메서드 오버라이딩");
	System.out.println("age : "+age);
}

public static void main(String[] args) {
 TT t=new abstractT(63);
 t.kk();
 t.disp();
}
}