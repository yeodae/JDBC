package day9_2;

import java.util.Calendar;
import java.util.Scanner;

public class Time {
	int Player(String name){
		
		Scanner s = new Scanner(System.in);
		System.out.print("1p엔터 누르셈");
		s.nextLine();
		Calendar now = Calendar.getInstance();//현재로 초기화
		int s1 = now.get(Calendar.SECOND);
		System.out.println("현재 초 : " + s1);
		System.out.println("10초에 가깝게 enter 누르셈");
		s.nextLine();
		now = Calendar.getInstance();
		int s2 = now.get(Calendar.SECOND);
		System.out.println("마지막 초 : " + s2);
		int sum1 = (s2 > s1) ? s2 - s1 : (s2 + 60) - s1;
		System.out.println("둘의 차이는 " + sum1);
		return sum1;
		
	}
}
