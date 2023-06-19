package day3;

import java.util.Arrays;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc=new Calc();//객체생성
		calc.sum(); //메시지 호출
		
//		int a = calc.sum2(1,2); //0
		int max=calc.max(1, 100);
		int min=calc.min(1, 100);
		int abs=calc.abs(-3); // 절대값리턴
		int min2=calc.min(3,2,4);//오버로드:매개변수가 달라 사용가능
		double sum2=calc.sum2(2.6, 1.4);
		int arr[]={3,5,2,1,8};
		int arrMax= calc.arrMax(arr);
		double arrAvg=calc.arrAvg(arr);
		
//		System.out.println(a);//a=매개변수
		System.out.println(max);
		System.out.println(min);
		System.out.println(abs);
		System.out.println(min2);//오버로드:min
		System.out.println(sum2);//오버로드:sum2
		System.out.println(arrMax);
		System.out.println(arrAvg);
		
		int a=10;
		calc.test1(a);
		System.out.println(a);//10;
		calc.test2(arr);//배열(객체)은 같은 주소를 사용하여 넘어옴.
		System.out.println(Arrays.toString(arr));
	}

}
