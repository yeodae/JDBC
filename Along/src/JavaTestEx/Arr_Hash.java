package JavaTestEx;
import java.util.*;
public class Arr_Hash {
	static int score(Scanner s,String kind,int limit){
		
		int num;
		
		while(true){
			System.out.println(kind+"���� �Է�");
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
			System.out.println("1.�Է� 2.���� 3.��� 4.����");
			int input=s.nextInt();
			
			if(input==1){
			HashMap<String,Object> map = new HashMap<>();
			System.out.println("�̸� �Է�");
			map.put("name",s.next());
			System.out.println("���� �Է�");
			map.put("age",s.next());
//			System.out.println("�ڹ� ���� �Է�");
			map.put("java",score(s,"�ڹ�",100));
//			System.out.println("����Ŭ ���� �Է�");
			map.put("oracle",score(s,"����Ŭ",100));
			
			list.add(map);
			}else if(input == 2){
				System.out.println("������ �̸� �Է�");
				String name = s.next();
				
				for(int i=0; i<list.size(); i++){
					HashMap<String,Object> v = list.get(i);
					if(v.get("name").equals(name)){
						list.remove(i);
						System.out.println("���� �Ϸ�");
					}
				}
			}else if(input ==3){
				
				for(int i=0; i<list.size(); i++){
					HashMap<String,Object> v = list.get(i);
					System.out.println("�̸� : "+v.get("name"));
					System.out.println("���� : "+v.get("age"));
				}
			}else if(input ==4){
				System.out.println("�����մϴ�.");
				break;
			}
			
		}
		
		
	}
}
