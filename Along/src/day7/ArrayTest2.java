package day7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> v = new ArrayList<>();
		Scanner s = new Scanner(System.in);

		int max=0;
		int min=0;

		for(int i=0; i<5; i++){
			System.out.print((i+1)+"번째 숫자입력>>");
			v.add(s.nextInt());
		}
		for(int i=0; i<v.size(); i++){
			if(v.get(i)>v.get(max)){
				max=i;
			}
			if(v.get(i)<v.get(min)){
				min=i;
			}

		}
		System.out.println("큰 수 : "+v.get(max)+" 작은 수 : "+v.get(min));
		int temp = v.get(max); 
		// temp = 9
		v.add(max, v.get(min));
		// ex, 5, 3, 7, 6, 3, 9
		v.remove(max+1);
		// ex, 5, 3, 7, 6, 3
		v.add(min, temp);
		// ex, 5, 9, 3, 7, 6, 3
		v.remove(min+1);
		// ex, 5, 9, 7, 6, 3

//		v.set(max, v.get(min));
//		v.set(min, temp);

		System.out.println(v);
	}

}
