package JavaTestEx;

import java.util.*;

public class Random999 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		while(true){
			System.out.println("��� �帱���? ����(0)");
			int input = s.nextInt();
			
			for(int i=0; i<input; i++){
				System.out.println((i+1)+"�� ����");
				int a = r.nextInt(8)+2;
				int b = r.nextInt(9)+1;
				System.out.println(a+"x"+b+"=");
				int num=a*b;
				int put=s.nextInt();
				
				if(num == put){
					System.out.println("����!");					
				}else{
					System.out.println("����! ����:"+num);
				}
			}
			if(input==0){
				System.out.println("�����մϴ�.");
				break;
			}
		}

	}

}
