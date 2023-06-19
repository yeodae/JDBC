package text;
//상위클래스
class SuperMan{
	//전역변수
	public String name;
	public int age;

	//생성자
	public SuperMan(){}//디폴트생성자
	public SuperMan(String name,int age){
		this.name=name;
		this.age=age;
	}

	//메서드
	public void disp(){
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+age);
	}

}
//파생클래스
class SuperBoy extends SuperMan{
	//전역변수
	public String grade;

	//생성자
	public SuperBoy(){}
	public SuperBoy(String grade,String name,int age){
		super(name,age);
		this.grade=grade;
	}
	//메서드
	public void disp(){
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
		System.out.println(grade+"학교 재학중입니다.");
	}
}

//파생클래스
class Supermom extends SuperMan{
	//전역변수
	public String addr;

	public Supermom(){}
	public Supermom(String addr,String name,int age){
		super(name,age);
		this.addr=addr;
	}

	public void disp(){
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("사는곳: "+addr);
	}

	public void boom(){
		System.out.println("boom!");
	}
}


public class Ttest {
	public static void main(String[] args) {
		SuperMan s = new SuperMan("스파이더맨",25);
		s.disp(); //상위클래스 호출
		System.out.println();//줄바꿈
		
		s=new SuperBoy("초등","진수",13);
		s.disp();//파생1 호출
		System.out.println();//줄바꿈
		
		s=new Supermom("우리집","뽀로로",30);
		s.disp();
		
		((Supermom)s).boom();
	}
}
