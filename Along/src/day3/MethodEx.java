package day3;
//1.변수3개(int형 2개, double형 1개)
// sum 메서드 호출 시 3개의 값을 더하여 리턴.
//2.메인 메서드에서 객체생성.
//3.객체에 있는 3개 변수를 스캐너로 입력 받아서 초기화.
//4.sum 메서드 호출
import java.util.Scanner;
public class MethodEx {
	int a;
	int b;
	double c;//변수생성
	
	public double sum(){//메서드생성
		return a+b+c;
	}
	public static void main(String[] args) {
		MethodEx M=new MethodEx();//객체생성
		Scanner s=new Scanner(System.in);
		
		System.out.println("첫번째로 더할 정수를 입력해주세요.");
		M.a =s.nextInt();
		System.out.println("두번째로 더할 정수를 입력해주세요.");
		M.b =s.nextInt();
		System.out.println("마지막으로 더할 실수를 입력해주세요.");
		M.c =s.nextDouble();
		System.out.println("세 수의 합 : "+M.sum());
		s.close();////OS자원을 다시 되돌리는것.

	}

}
