package text;

public class GameMain {
	public static void main(String[] args) {
		Game G = new Game();
		int num = G.input("ȫ�浿");
		int num2 = G.input("�̹���");
		
		if(num > num2){
			System.out.println("�̹���¸�");
		}else if(num2 == num){
			System.out.println("����!");
		}else{
			System.out.println("ȫ�浿 �¸�!");
		}
	
	}
}
