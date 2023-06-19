package day4;

public class Sample2 {
	public static void main(String[] args) {
		System.out.println(Calc2.max(1.5,2.5));
		System.out.println(Calc2.strMax("test", "test123"));
		System.out.println("test".length());
		System.out.println(Calc2.chMax('c', 'G'));
		System.out.println(Calc2.strMaxLen("test", "test123"));
		
		TestReturn test = new TestReturn();
		test.sum(1, 3); // 리턴없는형 : void
		
		int a=test.sum(1, 2, 3);
		System.out.println(a); //return 사용
	}
}
