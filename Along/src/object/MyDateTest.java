package object;

public class MyDateTest {
	public static void main(String[] args) {

		MyDate date1 = new MyDate(9, 18, 2004);
		MyDate date2 = new MyDate(9, 18, 2004);
		
		//서로 다른 메모리주소에 존재하는 인스턴스이므로 false를 반환하지만
		//매개변수는 같으므로 equals()는 true를 반환하도록 재정의하라.
		
		System.out.println(date1.equals(date2));
		
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
	}
	
	
}
