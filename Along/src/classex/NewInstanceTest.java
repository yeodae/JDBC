package classex;

public class NewInstanceTest {
//Person클래스의 인스턴스 생성하기
	public static void main(String[] args)throws ClassNotFoundException,
	InstantiationException, IllegalAccessException	{
		Person person1 = new Person( );
		//생성자로 생성하기
		System.out.println(person1);
		
		Class pClass = Class.forName("classex.Person");
		//Person클래스 이름을 사용하여 Class클래스를 반환.
		Person person2 = (Person)pClass.newInstance();
		//Class클래스의 newInstance()메서드 호출하면서
		//Person클래스의 디폴트 생성자가 호출되어 인스턴스가 생성.
		//newInstance()의 반환값이 Object이므로 Person클래스
		//로 다운 캐스팅한것을 알 수 있습니다.
		System.out.println(person2);
		//Class클래스의 newInstance()메서드로 생성하기.
		
	}

}
