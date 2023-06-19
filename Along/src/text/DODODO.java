package text;

import java.util.Arrays;

public class DODODO {
	public static void main(String[] args) {
		int arr[]={1,2,3};
		int min1 =0;
		int sum=0;
		int answer=0;
		int max=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]<arr[min1]){
				min1=i;
			}
			if(arr[i]>arr[max]){
				max=i;
			}
		}
		for(int i=0; i<arr.length; i++){
			if(arr[max]!=arr[i]){
				 sum+=i;
			}
		}
		
		if(sum>=arr[max]){
			answer = 1;
		}else{
			answer = 2;
		}
		
		System.out.println(answer);//3

		System.out.println(Arrays.toString(arr));
	}
}
