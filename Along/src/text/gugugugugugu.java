package text;

import java.util.Random;
import java.util.Scanner;

public class gugugugugugu {
	public static void main(String[] args) {
		System.out.println("���� �������� �����մϴ�");
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		
		while(true){
			System.out.println("���?");
			int num=s.nextInt();
			for(int i=1; i<=num; i++){
				System.out.println("����!");
				int a = r.nextInt(8)*2;
				int b = r.nextInt(9)*1;
				System.out.println(a+"x"+b+"=");
				int sum=a*b;
				int input=s.nextInt();
				if(sum==input){
					System.out.println("����!");
				}else{
					System.out.println("����!");
				}
			}
			System.out.println("����Ͻðڽ��ϱ�? 0�������� ����");
			int exit=s.nextInt();
			if(exit ==0){
				break;
			}
		}
		System.out.println("�����ϼ˽��ϴ�.");
	}
}
