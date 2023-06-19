package day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex3 {
	static int score(Scanner s, String kind, int limit){
		System.out.println(kind + "점수 입력");
		int num;
		while(true){
			num=s.nextInt();
			if(num > limit || num <0 ){
				System.out.println("0~"+limit);
			}else {
				break;
			}
		}		
		return num;
	}
	public static void main(String[] args) {
		ArrayList<HashMap<String,Object>> list = new ArrayList<>();
		//HashMap<String,Object> v = new HashMap<>();
		Scanner s=new Scanner(System.in);
		
		while(true){
			System.out.println("(1)입력, (2)삭제, (3)출력, (4)종료 :");
			int input = s.nextInt();
			
			if(input == 1){//입력
				HashMap<String,Object> v = new HashMap<>();
				System.out.println("이름 입력");
				v.put("name",s.next());
				System.out.println("나이 입력");
				v.put("age",s.nextInt());
				
//				System.out.println("JAVA점수 입력");
//				while(true){
//				int j=s.nextInt();
//				if(0<=j && 100>=j){
//					v.put("java", j);
//					break;
//				}else System.out.println("0~100 다시 입력");
//				}
				v.put("java",score(s,"자바",100));
			
//				System.out.println("오라클 점수 입력");
//				while(true){
//				int o=s.nextInt();
//				if(0<=o && 100>=o){
//					v.put("oracle", o);
//					break;
//				}else System.out.println("0~100 다시 입력");
//				}
				v.put("oracle", score(s, "오라클", 100));
				v.put("html", score(s,"HTML",80));
				list.add(v);//v를 list에 저장
				
			}else if(input == 2){//삭제
				System.out.println("삭제할 회원의 이름과 나이를 입력해주세요.");
				String name=s.next();
				int age=s.nextInt();
				for(int i=0; i<list.size(); i++){
					HashMap<String,Object> v = list.get(i);
					if(v.get("name").equals(name) && v.get("age").equals(age)){
						list.remove(i);
						System.out.println("삭제완료");
					}
				}
				
				
			}else if(input == 3){//출력
				for(int i=0; i<list.size(); i++){
					HashMap<String,Object> v = list.get(i);
					System.out.print("이름 : "+v.get("name"));
					System.out.print(", 나이 : "+v.get("age"));
					System.out.print(", 자바점수 : "+v.get("java"));
					System.out.print(", 오라클점수 : "+v.get("oracle"));
					System.out.println(", HTML점수 : "+v.get("html"));
					System.out.println();
				}
				
			}else if(input == 4){//종료
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}

}
