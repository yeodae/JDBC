package day9.Test;
import java.util.*;
public class Test5 {
	static int score(Scanner s,String kind,int limit){
		int num;

		while(true){
			System.out.println(kind+" �Է�");
			num=s.nextInt();
			if(limit>=num && num>=0){
				return num;
			}else{
				System.out.println("0~"+limit+"���� ���� �ƴϸ� �ٽ� �Է�");
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<HashMap<String,Object>> list = new ArrayList<>();
		Scanner s=new Scanner(System.in);

		while(true){
			System.out.println("(1)�Է� �κ� (2)���� �κ� (3)��� �κ� �׿� ����κ�");
			int input=s.nextInt();
			if(input == 1){
				HashMap<String,Object> v = new HashMap<>();
				System.out.println("�̸� �Է�");
				v.put("name",s.next());
				v.put("java",score(s,"�ڹ� ����",30));
				v.put("oracle",score(s,"����Ŭ ����",50));
				v.put("html",score(s,"html ����",20));

				list.add(v);
			}else if(input == 2){
				System.out.println("������ �̸� �Է�");
				String name=s.next();

				for(int i=0; i<list.size(); i++){
					HashMap<String,Object> v = list.get(i);
					if(v.get("name").equals(name)){
						list.remove(i);
						System.out.println("���� �Ϸ�");
					}
				}
			}else if(input == 3){
				for(int i=0; i<list.size(); i++){
					HashMap<String,Object> v = list.get(i);

					int java=(int) v.get("java");
					int oracle=(int) v.get("oracle");
					int html=(int) v.get("html");
					int sum = java + oracle + html;

					System.out.println("�̸�:"+v.get("name")+", ����:"+sum);
				}
			}else{
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
}

