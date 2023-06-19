package day8_2;
// HashMap에 객체 저장, 학생 정보 관리
public class Human {
	private String name;
	private int age;
	private String addr;
	private int javaScore;
	
	public Human(String name, int age, String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
		
	} //set은 생성자로 주기때문에 get메서드만 생성.

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddr() {
		return addr;
	}

	public int getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(int javaScore){
		this.javaScore=javaScore;
	}

	
}
