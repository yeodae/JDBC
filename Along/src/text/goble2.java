package text;

import java.util.Scanner;

public class goble2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("입력해주세요");
		// String name = s.next();
		int age = s.nextInt();

		/*for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}*/
		for(int i=age; i<=age; i++){
			for(int j=1; j<=9; j++){
				System.out.println(i+"x"+j+"="+i*j);
			} 
		}
	}
}
