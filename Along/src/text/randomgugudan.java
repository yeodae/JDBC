package text;
import java.util.Scanner;
import java.util.Random;
public class randomgugudan {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);

		while(true){
			System.out.println("몇문제 푸시겠습니까?");
			int d=s.nextInt();
			for(int i=1; i<=d; i++){
				System.out.println(i+"번 문제");
				
				int a = (int)(Math.random()*9+1);
//				int a = r.nextInt(9)+1;
				int b = r.nextInt(9)+1;
				System.out.print(a+"x"+b+"=");
				int n=s.nextInt();

				if(n==a*b){
					System.out.println("정답입니다");
				} else {
					System.out.println("오답입니다");
				} 
			}//for-end
			System.out.println("계속 하시겠습니까? 0을 누르면 종료");
			int su=s.nextInt();
			if(su==0){
				System.out.println("종료되었습니다");
				break;
			}
		}//while-end	
	}
}
