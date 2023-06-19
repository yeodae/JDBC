package day6;

public class GoodCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		double sum=0;
		for(int i=0; i<a.length; i++){
			sum+=a[i];
		}
		//for(int i : a){
		//sum +=a;
		return sum/a.length;
	}

	public static void main(String[] args) {

		GoodCalc c = new GoodCalc();//°´Ã¼»ı¼º
		System.out.println(c.add(1,2));
		System.out.println(c.subtract(3,4));
		System.out.println(c.average(new int[]{5,6,7}));
	}
}
