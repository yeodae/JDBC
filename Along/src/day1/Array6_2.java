package day1;

import java.util.Arrays;

public class Array6_2 {
	public static void main(String[] args) {
		int arr[] = {7,6,9,3,5};
		int temp=0;
		int min=0;
		
		for(int i=0; i<arr.length; i++){
			if(arr[min]>arr[i]){
				min=i; // min 3 최소값 위치 저장
			}
		}
		//위치바꾸기
		temp=arr[0];
		arr[0]=arr[min];
		arr[min]=temp;
		System.out.println(Arrays.toString(arr));
		
//		int temp=0;
//		int min=0;
//		//가장 작은숫자를 첫번째로 옮기기
//		
//		for(int i=0; i<arr.length; i++){
//			if(arr[min]>arr[i]){
//				min=i; // 최소값 3 저장
//			}
//		}
//		temp=arr[0];//7저장
//		arr[0]=arr[min];
//		arr[3]=temp;
//		System.out.println(Arrays.toString(arr));
	}
}
