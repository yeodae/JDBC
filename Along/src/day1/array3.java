package day1;

public class array3 {
	public static void main(String[] args) {
		int arr[] = {5,2,-3,1,-4,6,8,-7,9};
		int min=arr[0];

		for(int i=0; i<arr.length; i++){
			if(arr[i]>0){
				min=Math.min(min,arr[i]);
			}
			//if(arr[i]>0&&min>arr[i]){
			//min=arr[i];
		}
		System.out.println(min);
	}
}
