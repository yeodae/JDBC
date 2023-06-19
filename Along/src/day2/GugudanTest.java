package day2;

import java.util.Arrays;
import java.util.Random;

public class GugudanTest {
	public static void main(String[] args) {
		//		1.6개의 숫자를 입력받아 배열에 저장하고 숫자에 순차적으로 접근하여
		//		홀수일 경우 음수로 바꿔준다
		//		int arr[]=new int[6];
		//		Random ran=new Random();
		//
		//		for(int i=0; i<arr.length; i++){
		//			arr[i]=ran.nextInt(10)+1;
		//			if(arr[i]%2==1){
		//				//						int num=arr[i];
		//				//						arr[i]=-num;
		//				arr[i]= -arr[i];
		//			}
		//		}

		//2.배열{15,22,33,50,19,2}의 홀수들의 평균과 짝수들의 평균 구하기
		//		int arr[]={15,22,33,50,19,2};
		//		int hol=0;
		//		int jj=0;
		//		int count=0;
		//		int count2=0;
		//		for(int i=0; i<arr.length; i++){천리안
		//			if(arr[i]%2==0){
		//				jj+=arr[i]; //짝수의합
		//				count++;
		//			}else if(arr[i]%2==1){
		//				hol+=arr[i];//홀수의합
		//				count2++;
		//			}
		//		}
		//		System.out.println("짝수의 합평균: "+((double)jj/count));
		//		System.out.println("홀수의 합평균: "+((double)hol/count2));

		//3.배열{40,-20,-30,-10,50}에서 가장 큰 수와 가장 작은수를 빼시오
		//단, 음수는 절대값
		//(ex, 가장 큰 수 : 50, 가장 작은 수 : -10, 결과 40)
		int arr[]={40,-20,-30,-10,50};
		int max=0;
		int min=0;
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(Math.abs(arr[i])>Math.abs(arr[j])){
					i=j;//절대값으로 변환한 최소값 10
					min=arr[i];//-10
				}else if(arr[i]<arr[j]){
					i=j;//최대값 구하기 50
					max=arr[i];
				}
			}

			//			int max=Math.abs(arr[0]);
			//			int min=Math.abs(arr[0]);//절대 최소값
			//			for(int i=0; i<arr.length; i++){
			//				max=Math.max(max, Math.abs(arr[i]));//배열안 큰수 구하기
			//				min=Math.min(min,Math.abs(arr[i]));//배열안 작은수 구하기 Math.min(int a, b)
			//			}
			//			System.out.println(max-min);
			//			
			System.out.println(max-(-min));
		}
		System.out.println(Arrays.toString(arr));
	}
}
