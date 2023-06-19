package object;

public class ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book(200, "개미");

		System.out.println(book1);
		//인스턴스 정보(클래스 이름.주소값) ~ 자동으로 toString호출
		System.out.println(book1.toString( ));
		//toString()메서드로 인스턴스정보(클래스 이름.주소값)을 보여줌
		
		Student studentYeo = new Student(130212,"여대현");
		System.out.println(studentYeo);
	}
}
