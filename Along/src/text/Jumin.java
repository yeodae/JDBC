package text;

import java.util.Scanner;

public class Jumin {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("주민번호 입력하세요");
		String jumin = s.next().substring(7,8);
		if(jumin.equals("1") || jumin.equals("3")){
			System.out.println("남성");
		}else if(jumin.equals("2") || jumin.equals("4")){
			System.out.println("여성");
		}else{
			System.out.println("다시 입력해주세요.");
		}

	}

}
