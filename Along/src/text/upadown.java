package text;

import java.util.Random;
import java.util.Scanner;

public class upadown {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Random r=new Random();

		System.out.println("���شٿ� ���ӽ���");
		int fix =r.nextInt(100)*1;
		System.out.println("����!");
		int i = 0;
		while(true){
			System.out.println("1~100����!");
			int in=s.nextInt();
			if(in==fix){
				System.out.println("����!"+i);
				break;
			}else if(in>fix){
				System.out.println("down");
				i++;
			}else if(in<fix){
				System.out.println("up");
				i++;
			}
		}
	}
}
