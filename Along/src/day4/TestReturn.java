package day4;

public class TestReturn {
	public void sum(int a, int b){
		int c = a + b;
		System.out.println(c);
	}
	//리턴이 없는형 = void 
	public int sum(int a, int b, int c){//오버로딩
		return a + b + c;
		//리턴필요
	}
}
