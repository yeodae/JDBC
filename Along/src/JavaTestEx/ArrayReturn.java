package JavaTestEx;
import java.util.*;
public class ArrayReturn {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner s=new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++){
			System.out.println((i+1)+"번 배열 숫자 입력");
			arr[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		
		int max=0;
		int min=0;
		
		for(int i=1; i<arr.length; i++){
			if(arr[i]<arr[min]){
				min=i;
			}
			if(arr[i]>arr[max]){
				max=i;
			}
		}
		int temp=arr[max];
		arr[max]=arr[min];
		arr[min]=temp;
		System.out.println(Arrays.toString(arr));
	}

}
