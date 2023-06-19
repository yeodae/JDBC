package day8_2;
import java.util.*;
public class CopyOfPersonMain2 {
	

	public static void main(String[] args) {
		HashMap<String,Person> map = new HashMap<>();
		Scanner s=new Scanner(System.in);
		
		while(true){
			System.out.println("1.입력 2.삭제 3.출력 4.종료");
			int input=s.nextInt();
			if(input == 1){
				System.out.println("이름");
				String name = s.next();
				System.out.println("나이");
				int age = s.nextInt();
				System.out.println("주소");
				String addr = s.next();
				
				Person p = new Person(name,age,addr);
				map.put(name, p);
				
			}else if(input == 2){
				System.out.println("삭제할 회원 입력");
				String name = s.next();
				if(map.containsKey(name)){
					map.remove(name);
					System.out.println("삭제완료");
				}
				
			}else if(input == 3){
				Set<String> keys=map.keySet();
				Iterator<String> it=keys.iterator();
				
				while(it.hasNext()){
					Person p = map.get(it.next());
					System.out.println("이름 : "+p.getName());
					System.out.println("나이 : "+p.getAge());
					System.out.println("주소 : "+p.getAddr());
				}
			}else if(input == 4){
				System.out.println("종료");
				break;
			}
		}
		
		
		
		
	}

}
