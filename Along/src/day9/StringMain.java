package day9;

import java.util.Scanner;

public class StringMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� �Է�");
		int a = s.nextInt();
		// \n <- ���ԵǾ� 1�ٷ� �ν�
		s.nextLine(); // \n �����ָ� �ذ�
		System.out.println("���� �Է�");
		String b = s.nextLine();
		
		System.out.println(a);
		System.out.println(b);

	}

}
