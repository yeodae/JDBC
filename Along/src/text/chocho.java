package text;

import java.util.Random;
import java.util.Scanner;
public class chocho {
	public static void main(String[] args) {
		//
		//		Random r=new Random();
		//		Scanner s=new Scanner(System.in);
		//
		//		System.out.println("������ 1~100 ���� ���ڸ� ���߼���!");
		//		int a=r.nextInt(100)+1;
		//		System.out.println("�����մϴ�.");
		//		int i=1;
		//
		//		while(true){
		//			System.out.println("1~100 ���� Up&Down");
		//			int num=s.nextInt();
		//
		//			if(a==num){
		//				System.out.println("�����Դϴ�!"+i+"�� ���� ���߼̽��ϴ�.");
		//				break;
		//			} else if(a>num){
		//				i++;
		//				System.out.println("Up!!");
		//			} else if(a<num){
		//				System.out.println("Down!");
		//				i++;
		//			} 
		//		}//while-end

		Random r=new Random();
		Scanner s=new Scanner(System.in);
		int c=1;

		while(true){
			System.out.println("��� �帱���? ");
			int d=s.nextInt();
			for(int i=1; i<=d; i++){
				System.out.println(i+"�� ����:");

				int a=r.nextInt(9)+1;//1~9����
				int b=r.nextInt(8)+2;//2~9����
				System.out.print(b+"x"+a+"=");
				int n=s.nextInt();
				if(n==a*b){
					System.out.println("����!");
				}else{
					System.out.println("��!");
				}
			}
			System.out.println("��� �Ͻðڽ��ϱ�? 0�� ������ ����");
			int exit=s.nextInt();
			if(exit==0){
				System.out.println("����");
				break;
			}
		}



	}
}
