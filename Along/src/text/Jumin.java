package text;

import java.util.Scanner;

public class Jumin {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�ֹι�ȣ �Է��ϼ���");
		String jumin = s.next().substring(7,8);
		if(jumin.equals("1") || jumin.equals("3")){
			System.out.println("����");
		}else if(jumin.equals("2") || jumin.equals("4")){
			System.out.println("����");
		}else{
			System.out.println("�ٽ� �Է����ּ���.");
		}

	}

}
