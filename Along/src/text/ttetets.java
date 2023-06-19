package text;

import java.util.Arrays;

public class ttetets {

	public static void main(String[] args) {
		int arr[] ={5, 3, 10, 2, 9, 8};
		Arrays.sort(arr);
		int index=0;
		int resultArray[]=new int[6];
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==1){
				resultArray[index++]=arr[i];
			}
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==0){
				resultArray[index++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(resultArray));
	}

}
