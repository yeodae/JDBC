package day8_2;
// HashMap에 객체 저장, 학생 정보 관리
import java.util.*;
public class HumanMain {
	public static void main(String[] args) {
		HashMap<String,Human> map = new HashMap<>();
	
		Human hong = new Human("홍길동",30,"서울");
//		map.put("홍길동", new Human("홍길동",30,"서울"));
		map.put("홍길동",hong);
		
		map.put("유재석",new Human("유재석",40,"인천"));
//		System.out.println(map.get("홍길동").getAddr());
		//서울 출력
		
		//처음에 홍길동 , 그다음 유재석 접근해서
		//스캐너로 점수 입력 받아서 javaScore 채우기.
//		Scanner s = new Scanner(System.in);
//		hong = map.get("홍길동");
//		hong.setJavaScore(s.nextInt());
//		map.put("홍길동",hong);
//		System.out.println(hong.getJavaScore());
		
		//keySet() 메서드 활용
		//
		Set<String> keys = map.keySet();
		// key 문자열을 가진 집합 Set 컬렉션 리턴
		Iterator<String> it = keys.iterator();
//		Iterator<String> it = map.keySet().iterator();
		//key 문자열을 순서대로 접근할 수 있는 Iterator 호출
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
	}

}
