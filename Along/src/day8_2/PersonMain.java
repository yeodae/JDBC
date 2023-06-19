package day8_2;
import java.util.*;
public class PersonMain {
	

	public static void main(String[] args) {
		HashMap<String,Person> map = new HashMap<>();
		Scanner s=new Scanner(System.in);
		
		while(true){
			System.out.println("(1)입력, (2)삭제, (3)출력, (4)종료 :");
			int input = s.nextInt();
			
			if(input == 1){
//				HashMap<String,Person> map = new HashMap<>();
				System.out.println("이름 입력");
				String name = s.next();
				System.out.println("나이 입력");
				int age = s.nextInt();
				System.out.println("주소 입력");
				String addr = s.next();
				
				Person p = new Person(name,age,addr);
				map.put(name,p);
				
			}else if(input == 2){
				System.out.println("삭제할 회원 이름입력");
				String name=s.next();
				if(map.containsKey(name)){
					map.remove(name);
				}
				
				
			}else if(input == 3){//Iterator를 이용한 모든 문자열 출력
				Set<String> keys = map.keySet();
				//key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
				Iterator<String> it = keys.iterator();
				
				while(it.hasNext()){
//					System.out.println(it.next());//홍길동
					Person p = map.get(it.next());
					System.out.print("이름 : "+p.getName());
					System.out.print(", 나이 : "+p.getAge());
					System.out.print(", 주소 : "+p.getAddr());
					System.out.println();
				}
				
			}else if(input == 4){
				System.out.println("종료합니다.");
				break;
			}
		}
		
		
	}

}
