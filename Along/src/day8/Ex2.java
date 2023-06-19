package day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		Scanner s=new Scanner(System.in);


		while(true){
			System.out.println("(1)입력, (2)삭제, (3)출력, (4)종료 :");
			int input = s.nextInt();
			//HashMap<String, Object> v = new HashMap<>();
			if(input==1){
				System.out.println("입력 부분");
				//HashMap<String, Object> v = new HashMap<>();
				System.out.println("사용자 정보 입력");
				HashMap<String, Object> v = new HashMap<>();
				System.out.println("이름>>");
				v.put("name",s.next());
				System.out.println("나이>>");
				v.put("age",s.nextInt());
				System.out.println("성별>>");
				v.put("gender",s.next());
				System.out.println("주소>>");
				v.put("addr",s.next());
				list.add(v);//ArrayList i번째 배열에 입력
			}else if(input==2){
				System.out.println("삭제 부분");
				System.out.println("삭제할 회원을 입력하세요.");
//				String name=s.next(); 중복계속뜨면 사용
				for(int i=0; i<list.size(); i++){
					HashMap<String, Object> v = list.get(i);
					if(v.get("name").equals(s.next())){
						System.out.println("제발");
						list.remove(i);
					}
				}
				//v.remove(v.get(s.next()));
				System.out.println("해당 회원 삭제 완료");

			}else if(input==3){
				System.out.println("출력 부분");
				for(int i=0; i<list.size(); i++){
					System.out.print("이름 : "+list.get(i).get("name"));
					System.out.print(", 나이 : "+list.get(i).get("age"));
					System.out.print(", 성별 : "+list.get(i).get("gender"));
					System.out.print(", 주소 : "+list.get(i).get("addr"));
					System.out.println();
				}

			}else if(input==4){
				System.out.println("종료 부분");
				System.out.println("정상 종료되었습니다.");
				break;
			}
		}
	}
}
