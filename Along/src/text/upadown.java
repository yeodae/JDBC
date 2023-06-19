package text;

import java.util.Random;
import java.util.Scanner;

public class upadown {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Random r=new Random();

		System.out.println("업앤다운 게임시작");
		int fix =r.nextInt(100)*1;
		System.out.println("시작!");
		int i = 0;
		while(true){
			System.out.println("1~100사이!");
			int in=s.nextInt();
			if(in==fix){
				System.out.println("정답!"+i);
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
