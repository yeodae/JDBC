package JavaTestEx;
import java.util.*;
public class Arr_Hash {
	static int score(Scanner s,String kind,int limit){
		
		int num;
		
		while(true){
			System.out.println(kind+"점수 입력");
			num=s.nextInt();
			if(limit>num && 0<num){
				break;
			}else{
				System.out.println("0~"+limit);
			}
		}
		return num;
		
	}
	

	public static void main(String[] args) {
		ArrayList<HashMap<String,Object>> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.println("1.입력 2.삭제 3.출력 4.종료");
			int input=s.nextInt();
			
			if(input==1){
			HashMap<String,Object> map = new HashMap<>();
			System.out.println("이름 입력");
			map.put("name",s.next());
			System.out.println("나이 입력");
			map.put("age",s.next());
//			System.out.println("자바 점수 입력");
			map.put("java",score(s,"자바",100));
//			System.out.println("오라클 점수 입력");
			map.put("oracle",score(s,"오라클",100));
			
			list.add(map);
			}else if(input == 2){
				System.out.println("삭제할 이름 입력");
				String name = s.next();
				
				for(int i=0; i<list.size(); i++){
					HashMap<String,Object> v = list.get(i);
					if(v.get("name").equals(name)){
						list.remove(i);
						System.out.println("삭제 완료");
					}
				}
			}else if(input ==3){
				
				for(int i=0; i<list.size(); i++){
					HashMap<String,Object> v = list.get(i);
					System.out.println("이름 : "+v.get("name"));
					System.out.println("나이 : "+v.get("age"));
				}
			}else if(input ==4){
				System.out.println("종료합니다.");
				break;
			}
			
		}
		
		
	}
}
