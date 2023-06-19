package text;
import java.util.Scanner;
import java.util.Random;
public class RandomGuGu {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		while(true){
			System.out.println("몇문제드릴까요");
			int input=s.nextInt();
			for(int i=1; i<=input; i++){
				System.out.println(i+"번 문제");

				int a=r.nextInt(8)+2;
				int b=r.nextInt(9)+1;
				System.out.println(a+"x"+b+"=");
				int input2=s.nextInt();
				if(input2==a*b){
					System.out.println("정답!");
				}else{
					System.out.println("오답!");
				}
			}
			System.out.println("끝, 더하시겠습니까? 0누르면 종료");
			int exit=s.nextInt();
			if(exit==0){
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}
