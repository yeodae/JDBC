package day9.Test;
import java.util.*;
public class Test5 {
	static int score(Scanner s,String kind,int limit){
		int num;

		while(true){
			System.out.println(kind+" 입력");
			num=s.nextInt();
			if(limit>=num && num>=0){
				return num;
			}else{
				System.out.println("0~"+limit+"사이 값이 아니면 다시 입력");
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<HashMap<String,Object>> list = new ArrayList<>();
		Scanner s=new Scanner(System.in);

		while(true){
			System.out.println("(1)입력 부분 (2)삭제 부분 (3)출력 부분 그외 종료부분");
			int input=s.nextInt();
			if(input == 1){
				HashMap<String,Object> v = new HashMap<>();
				System.out.println("이름 입력");
				v.put("name",s.next());
				v.put("java",score(s,"자바 점수",30));
				v.put("oracle",score(s,"오라클 점수",50));
				v.put("html",score(s,"html 점수",20));

				list.add(v);
			}else if(input == 2){
				System.out.println("삭제할 이름 입력");
				String name=s.next();

				for(int i=0; i<list.size(); i++){
					HashMap<String,Object> v = list.get(i);
					if(v.get("name").equals(name)){
						list.remove(i);
						System.out.println("삭제 완료");
					}
				}
			}else if(input == 3){
				for(int i=0; i<list.size(); i++){
					HashMap<String,Object> v = list.get(i);

					int java=(int) v.get("java");
					int oracle=(int) v.get("oracle");
					int html=(int) v.get("html");
					int sum = java + oracle + html;

					System.out.println("이름:"+v.get("name")+", 총점:"+sum);
				}
			}else{
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}

