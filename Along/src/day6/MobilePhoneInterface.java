package day6;

public interface MobilePhoneInterface extends PhoneInterface {
	void sendSMS(); 
	void receiveSMS(); // 새로운 추상 메서드 추가
}
