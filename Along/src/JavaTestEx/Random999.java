package JavaTestEx;

import java.util.*;

public class Random999 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		while(true){
			System.out.println("몇문제 드릴까요? 종료(0)");
			int input = s.nextInt();
			
			for(int i=0; i<input; i++){
				System.out.println((i+1)+"번 문제");
				int a = r.nextInt(8)+2;
				int b = r.nextInt(9)+1;
				System.out.println(a+"x"+b+"=");
				int num=a*b;
				int put=s.nextInt();
				
				if(num == put){
					System.out.println("정답!");					
				}else{
					System.out.println("오답! 정답:"+num);
				}
			}
			if(input==0){
				System.out.println("종료합니다.");
				break;
			}
		}

	}

}
