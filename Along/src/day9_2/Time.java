package day9_2;

import java.util.Calendar;
import java.util.Scanner;

public class Time {
	int Player(String name){
		
		Scanner s = new Scanner(System.in);
		System.out.print("1p���� ������");
		s.nextLine();
		Calendar now = Calendar.getInstance();//����� �ʱ�ȭ
		int s1 = now.get(Calendar.SECOND);
		System.out.println("���� �� : " + s1);
		System.out.println("10�ʿ� ������ enter ������");
		s.nextLine();
		now = Calendar.getInstance();
		int s2 = now.get(Calendar.SECOND);
		System.out.println("������ �� : " + s2);
		int sum1 = (s2 > s1) ? s2 - s1 : (s2 + 60) - s1;
		System.out.println("���� ���̴� " + sum1);
		return sum1;
		
	}
}
