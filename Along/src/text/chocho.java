package text;

import java.util.Random;
import java.util.Scanner;
public class chocho {
	public static void main(String[] args) {
		//
		//		Random r=new Random();
		//		Scanner s=new Scanner(System.in);
		//
		//		System.out.println("랜덤한 1~100 사이 숫자를 맞추세요!");
		//		int a=r.nextInt(100)+1;
		//		System.out.println("시작합니다.");
		//		int i=1;
		//
		//		while(true){
		//			System.out.println("1~100 사이 Up&Down");
		//			int num=s.nextInt();
		//
		//			if(a==num){
		//				System.out.println("정답입니다!"+i+"번 만에 맞추셨습니다.");
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
			System.out.println("몇문제 드릴까요? ");
			int d=s.nextInt();
			for(int i=1; i<=d; i++){
				System.out.println(i+"번 문제:");

				int a=r.nextInt(9)+1;//1~9까지
				int b=r.nextInt(8)+2;//2~9까지
				System.out.print(b+"x"+a+"=");
				int n=s.nextInt();
				if(n==a*b){
					System.out.println("정답!");
				}else{
					System.out.println("땡!");
				}
			}
			System.out.println("계속 하시겠습니까? 0을 누르면 종료");
			int exit=s.nextInt();
			if(exit==0){
				System.out.println("종료");
				break;
			}
		}



	}
}
