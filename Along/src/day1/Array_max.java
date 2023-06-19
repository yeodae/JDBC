package day1;

public class Array_max {
	public static void main(String[] args) {
		int arr[] = {5,2,3,1,4};
		int sum=0;
		int max=arr[0];
		for(int i=0; i<arr.length; i++){
			sum+=arr[i]; // 배열안 합산하는법
			if(arr[i]>max){
				max=arr[i]; //배열안 가장 큰값 찾는법 
			}				//max=Math.max(max,arr[i])
		}
		System.out.println("SUM: "+sum);
		System.out.println("MAX: "+max);
	}
}
