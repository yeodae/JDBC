package day9;

import java.util.Scanner;

public class StringMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 입력");
		int a = s.nextInt();
		// \n <- 남게되어 1줄로 인식
		s.nextLine(); // \n 날려주면 해결
		System.out.println("문자 입력");
		String b = s.nextLine();
		
		System.out.println(a);
		System.out.println(b);

	}

}
