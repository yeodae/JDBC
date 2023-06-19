package day9_2;

import java.util.*;

public class TimeGame {
	public static void main(String[] args) {
		// 엔터 눌렀을때 현재시간구하기
		// 두번재 엔터 누렀을때 현재시간
		// 둘의 차이 구하기

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

		
		
		System.out.print("2p엔터 누르셈");
		s.nextLine();
		now = Calendar.getInstance(); //현재로 초기화
		int s3 = now.get(Calendar.SECOND);
		System.out.println("현재 초 : " + s3);
		System.out.println("10초에 가깝게 enter 누르셈");
		s.nextLine();
		now = Calendar.getInstance();
		int s4 = now.get(Calendar.SECOND);
		System.out.println("마지막 초 : " + s4);
		int sum2 = (s4 > s3) ? s4 - s3 : (s4 + 60) - s3;
		System.out.println("둘의 차이는 " + sum2);

		int num1=Math.abs(10-sum1);
		int num2=Math.abs(10-sum2);
		
		if(sum1==sum2){
			System.out.println("비김");
		}else if(num1<num2){
			System.out.println("1p이김");
		}else{
			System.out.println("2p이김");
		}

	}
}

