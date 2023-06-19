package day1;

public class array4 {
	public static void main(String[] args) {
		int arr[] = {5,2,-3,1,-4,6,8,-7,9};
		//양수의합+음수의합=모든숫자의합
		int sum=0;
		for(int i=0; i<arr.length; i++){
			sum+=Math.abs(arr[i]);
		}
		System.out.println(sum);

		//양수의합+음수의합=
		int sum1=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]<0){
				sum1 += -arr[i];
			} else{
				sum1 += arr[i];
			}
		} 
		System.out.println(sum1);
	}
}
