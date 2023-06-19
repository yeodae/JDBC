package day1;

import java.util.Arrays;

public class Array6 {
	public static void main(String[] args) {
		int arr[] = {7,6,9,3,5};
		//선택정렬
		//{3, 6, 9, 7, 5}
		//{3, 5, 9, 7, 6}
		//{3, 5, 6, 7, 9}

		int minIndex=0; //2
		int maxIndex=0; //3
		//가장 큰 숫자와 가장작은 숫자의 위치바꾸기
		for(int i=0; i<arr.length; i++){
			if(arr[maxIndex]<arr[i]){
				maxIndex=i; //2 배열위치찾기
			}
			if(arr[minIndex]>arr[i]){
				minIndex=i;//3 배열위치찾기
			}
		}
		int temp = arr[maxIndex];//임시보관 9

		arr[maxIndex]=arr[minIndex];//7,6,★3,3,5
		arr[minIndex]=temp;//7,6,3,★9,5

		System.out.println("최대 값: "+arr[maxIndex]);
		System.out.println("최소 값: "+arr[minIndex]);
		System.out.println(Arrays.toString(arr));
	}
}
