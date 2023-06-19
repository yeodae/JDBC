package day9.Test;

import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) {
		 int arr[] = {3, 5, 2, 9, 8};
		// °á°ú : {9, 5, 2, 3, 8}
		 int max=0;
		 
		 for(int i=0; i<arr.length; i++){
			 if(arr[i]>arr[max]){
				 max=i;
			 }
		 }
		 int temp=arr[0];
		 arr[0]=arr[max];
		 arr[max]=temp;
		 System.out.println(Arrays.toString(arr));
	}

}
