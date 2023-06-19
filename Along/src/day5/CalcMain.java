package day5;

import java.util.Arrays;
import java.util.Scanner;

public class CalcMain {
	public static void main(String[] args) {
		Calc calc = new Calc();//객체생성
		calc.message();
		//"안녕하세요" 문구 출력
		System.out.println(calc.message2());
		//"안녕하세요2"문구 출력

		calc.sum(1,2);
		//3출력
		int a = calc.sum2(3,4);
		System.out.println(a);
		//7출력

		double b = calc.sum2(1, 2.5);
		System.out.println(b);
		//3.5출력

		//		Scanner s = new Scanner(System.in);
		//		System.out.println("숫자 두개를 입력해주세요");
		//		int c= s.nextInt();
		//		int d= s.nextInt();
		//		calc.max(c,d);
		//		//두개의 숫자를 입력받아서 = 큰 수는 00 입니다. 출력
		//		s.close();

		int arr[]={3, 2, 6, 5, 4};
//		calc.arr1(arr);
		//가장 작은 숫자와 가장 큰 숫자의 위치 바꾸기
		System.out.println(Arrays.toString(arr));
		//{3,6,2,5,4} //배열은 레퍼런스로 관리되기 때문에 리턴값이 없이 void사용
		
		calc.arr2(arr);
		//가장 작은 숫자와 마지막 배열 값과 위치 바꾸기
		System.out.println(Arrays.toString(arr));
		//{3,6,2,5,4} //배열은 레퍼런스로 관리되기 때문에 리턴값이 없이 void사용
		

	}
}
