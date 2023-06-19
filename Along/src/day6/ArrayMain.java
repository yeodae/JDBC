package day6;

import java.util.Arrays;

public class ArrayMain implements ArrayInterface{
	static int arr[] = {3,5,2,4,1};
	int max=arr[0];
	int min=arr[0];
	@Override //배열의 가장 큰 값과 작은 값의 차이
	public int MaxSubMin(int[] a) {
		for(int i=1; i<arr.length; i++){
			if(arr[i]<min){
				min=arr[i];
			}//min=Math.min(min,arr[i]);
			if(arr[i]>max){
				max=arr[i];
			}//max=Math.max(max,arr[i]);
		}
		return max - min;
	}

	@Override //배열의 가장 큰 값을 맨 마지막 값과 위치 바꾸기
	public void MaxChange(int[] a) {
		int maxIndex=0;
		for(int i=1; i<arr.length; i++){
			if(arr[i]>arr[maxIndex]){
				maxIndex=i;
			}
		}
		int temp = arr[arr.length-1];
		arr[arr.length-1]=arr[maxIndex];
		arr[maxIndex]=temp;

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		ArrayMain a = new ArrayMain();
		System.out.println(a.MaxSubMin(arr));
		a.MaxChange(arr);
	}
}
