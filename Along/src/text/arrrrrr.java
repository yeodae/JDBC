package text;

import java.util.Arrays;
//배열 뒤집기
public class arrrrrr {

	public static void main(String[] args) {

		int num_list[]={1,2,3,4,5};
		int answer[] = new int[num_list.length];
		int a=num_list.length;
		for(int i=0; i<num_list.length; i++){
			a--;
			answer[i]=num_list[a];

		}		
		System.out.println(Arrays.toString(answer));
	}
}
