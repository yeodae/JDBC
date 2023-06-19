package day6;

public class InterfaceMain implements InterfaceTest{

	@Override
	public int Add(int a, int b) {
		return a+b;
	}

	@Override
	public int Sub(int a, int b) {
		return a-b;
	}

	@Override
	public int Mul(int a, int b) {
		return a*b;
	}

	@Override
	public int Div(int a, int b) {
//		try{ // 예외처리
//			int c = a/b;
//		}catch(Exception e){
//			b=0;
//		}
		return a/b;
	}
	public static void main(String[] args) {
		InterfaceMain i=new InterfaceMain();
		System.out.println(i.Add(1,2));
		System.out.println(i.Sub(2,3));
		System.out.println(i.Mul(3,4));
		System.out.println(i.Div(5,5));
	}
}
