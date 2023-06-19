package day7_extends;

public class PersonMain {
	//메서드 생성 (info)
	//person을 상속받아서 만들어진 클래스들의 객체를
	//매개변수(파라미터)로 받는 매서드
	static void info(Person p){ //업캐스팅
		//Student 객체가 넘어오면 "학생 입니다." 문구 출력
		//StudentWorker 객체가 넘어오면 "직장인 입니다." 문구 출력
		//Rearcher 객체가 넘어오면 "연구원 입니다." 문구 출력
		//Professor 객체가 넘어오면 "교수 입니다." 문구 출력
		if(p instanceof StudentWorker){
			System.out.println("직장인 입니다..");
			StudentWorker obj = (StudentWorker)p;
			obj.work();//다운캐스팅 
		
		}else if(p instanceof Student){
			System.out.println("학생 입니다.");
			Student obj = (Student)p; 
			obj.study();//다운캐스팅 
		}else if(p instanceof Professor){
			System.out.println("교수 입니다.");
			Professor obj = (Professor)p;
			obj.teach();//다운캐스팅 
		}else if(p instanceof Researcher){
			System.out.println("연구원 입니다.");
			Researcher obj = (Researcher)p;
			obj.res();//다운캐스팅 
		}
		
//		p.info();
		
	}

	public static void main(String[] args) {
		//Student 객체를 Person형으로 업캐스팅.
		//Student s; // 객체 래퍼런스 선언 , 객체생성은 아님.
		Student s = new Student();//객체생성
//		Person s = new Student(); //Person형으로 업캐스팅
//		
		Researcher r = new Researcher();
		StudentWorker w = new StudentWorker();
		Professor pr = new Professor();
		
//		Object obj = new Professor();
		//Object클래스는 모든 클래스의 부모클래스 이기때문에
		//모든 클래스가 업캐스팅이 가능하다.
		
		info(s);
		info(w);
		info(r);
		info(pr);

	}
}
