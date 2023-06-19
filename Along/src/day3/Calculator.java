package day3;
//4. Calculator 클래스 생성
//1. 두개의 정수를 매개변수로 받아서 곱한 값을 리턴해주는 multiple 메소드 생성
//2. 3개의 정수를 입력받아서 곱한 값을 리턴해주는 multiple 메소드 생성
//3. 4개의 실수(double)를 입력받아서 가장 큰 값을 리턴해주는 max 메소드 생성
public class Calculator {
	int multiple(int x,int y){
		return x*y;
	}
	int multiple(int x,int y,int z){
		return x*y*z;
	}
	double max(double a,double b,double c,double d){
		double x=Math.max(a, b);
		double y=Math.max(c, d);
		return Math.max(x, y);
		//return Math.max(Math.max(c, d),Math.max(a, b));	
	}

	

	public static void main(String[] args){
		Calculator calc=new Calculator();
		System.out.println(calc.multiple(2,2));
		System.out.println(calc.max(1.1, 2.2, 3.3, 4.4));
	} 
}