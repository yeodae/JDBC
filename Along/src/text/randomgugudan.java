package text;
import java.util.Scanner;
import java.util.Random;
public class randomgugudan {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);

		while(true){
			System.out.println("��� Ǫ�ðڽ��ϱ�?");
			int d=s.nextInt();
			for(int i=1; i<=d; i++){
				System.out.println(i+"�� ����");
				
				int a = (int)(Math.random()*9+1);
//				int a = r.nextInt(9)+1;
				int b = r.nextInt(9)+1;
				System.out.print(a+"x"+b+"=");
				int n=s.nextInt();

				if(n==a*b){
					System.out.println("�����Դϴ�");
				} else {
					System.out.println("�����Դϴ�");
				} 
			}//for-end
			System.out.println("��� �Ͻðڽ��ϱ�? 0�� ������ ����");
			int su=s.nextInt();
			if(su==0){
				System.out.println("����Ǿ����ϴ�");
				break;
			}
		}//while-end	
	}
}
