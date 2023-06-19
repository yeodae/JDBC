package day4;

public class Human {
	String name;
	String add;
	String tel;
	int age;

	Human(String name){
		this(name,"알수없음","알수없음");//this() 활용
	}
	Human(String name,String add){
		this(name,add,"알수없음");//this() 활용
	}
	Human(String name,String add,String tel){
		this(name,add,tel,0);
	}
	Human(String name,String add,String tel,int age){
		this.name=name;
		this.add=add;
		this.tel=tel;
		this.age=age;
		
}
	
	public String toString(){
		return "이름은 "+name+"주소는 "+add+"핸드폰번호는 "+tel+" 입니다.";
	}
}

