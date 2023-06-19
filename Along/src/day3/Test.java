package day3;
import java.util.Arrays;
//문제
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		//		1. 구구단에서 5단을 제외하고 출력
		//		for(int i=2; i<10; i++){
		//			for(int j=1; j<10; j++){
		//				if(i%5!=0){
		//					System.out.println(i+"x"+j+"="+i*j);
		//				}
		//			}
		//		}
		//		2. 5개의 숫자를 입력받아서 배열 만들기. 단, 홀수만 들어가도록
		//		int arr[]=new int[5];
		//		Scanner scan=new Scanner(System.in);
		//		System.out.println("배열에 들어갈 정수를 입력해주세요.");
		//
		//		for(int i=0; i<arr.length; i++){
		//			int input=scan.nextInt();
		//			if(input%2==1){
		//				arr[i]=input;
		//				System.out.println("한번더 입력");
		//			}else{
		//				i--;
		//			}
		//		}
		//		System.out.println(Arrays.toString(arr));

		//		3. {5, 3, 10, 2, 9, 8}
		//		오름차순 정렬하기. 단, 홀수먼저 정렬하고 짝수 정렬
		//		ex) {3, 5, 9, 2, 8, 10}
		//		-> Arrays.sort() 써도 됨
		//		-> 홀수, 짝수의 개수는 같다고 가정
		int arr[] ={5, 3, 10, 2, 9, 8};
			
		Arrays.sort(arr);
		int resultArr[]=new int[arr.length];
		int index = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2!=0){
				resultArr[index++]=arr[i];
			}
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==0){
				resultArr[index++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(resultArr));

		//	4. Calculator 클래스 생성
		//	1. 두개의 정수를 매개변수로 받아서 곱한 값을 리턴해주는 multiple 메소드 생성
		//	2. 3개의 정수를 입력받아서 곱한 값을 리턴해주는 multiple 메소드 생성
		//	3. 4개의 실수(double)를 입력받아서 가장 큰 값을 리턴해주는 max 메소드 생성


	}
	
}
