package text;

import java.util.Random;
import java.util.Scanner;

public class gugugugugugu {
	public static void main(String[] args) {
		System.out.println("랜덤 구구단을 시작합니다");
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		
		while(true){
			System.out.println("몇문제?");
			int num=s.nextInt();
			for(int i=1; i<=num; i++){
				System.out.println("시작!");
				int a = r.nextInt(8)*2;
				int b = r.nextInt(9)*1;
				System.out.println(a+"x"+b+"=");
				int sum=a*b;
				int input=s.nextInt();
				if(sum==input){
					System.out.println("정답!");
				}else{
					System.out.println("오답!");
				}
			}
			System.out.println("계속하시겠습니까? 0을누르면 종료");
			int exit=s.nextInt();
			if(exit ==0){
				break;
			}
		}
		System.out.println("수고하셧습니다.");
	}
}
