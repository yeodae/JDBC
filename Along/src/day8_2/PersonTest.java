package day8_2;
import java.util.*;
public class PersonTest {
	private String name;
	private int age;
	private String addr;

	public PersonTest(){}

	public PersonTest(String name, int age, String addr) {
		this.name=name;
		this.age=age;
		this.addr=addr;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddr() {
		return addr;
	}

	public static void main(String[] args) {
		PersonTest hong = new PersonTest();
		Scanner s = new Scanner(System.in);

		HashMap<String,PersonTest> Map = new HashMap<>();

		while(true){
			System.out.println("(1)입력, (2)그만");
			int input=s.nextInt();
			if(input == 1){
				for(int i=0; i<2; i++){

					System.out.println("입력");
					String name = s.next();
					int age = s.nextInt();
					String addr = s.next();
					PersonTest p = new PersonTest(name,age,addr);
					Map.put(p.getName(),p);
				}
			}else if(input==2){
				System.out.println("종료합니다.");
				break;
			}
		}
		//		System.out.println(Map.get("홍길동").getAddr());
	}
}
