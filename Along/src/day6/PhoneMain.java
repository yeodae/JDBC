package day6;

public class PhoneMain {

	public static void main(String[] args) {
		SamsungPhone sPhone = new SamsungPhone();
		PhoneInterface phone;//객체생성은 불가.선언만 가능
		phone = sPhone; // 업캐스팅
		
		phone.sencCall();
		phone.receiveCall();
	}
}
