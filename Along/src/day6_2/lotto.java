package day6_2;

import java.util.Arrays;

public class lotto {
	public static void main(String[] args) {
		int lotto[] = new int[6];
		
		for(int i=0; i<lotto.length; i++){
			lotto[i]=(int)(Math.random()*45+1);
			for(int j=0; j<i; j++){
				if(lotto[i]==lotto[j]){
					i--;
					break;
				}
			}
		}
		System.out.print("행운의 숫자는 ");
		System.out.println(Arrays.toString(lotto));

	}

}
