package text;
import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
	public static void main(String[] args) {
		Random r=new Random();
		Scanner s=new Scanner(System.in);
		
		System.out.println("1~100 사이의 숫자를 맞추세요!");
		int fix=r.nextInt(100)+1;
		System.out.println("시작!");
		int i=0;
		
		while(true){
			System.out.println("1~100 UpAndDown");
			int say=s.nextInt();
			if(say==fix){
				System.out.println("정답! 도전횟수:"+i);
				break;
			}else if(say>fix){
				System.out.println("Down!");
				i++;
			}else if(say<fix){
				System.out.println("Up!");
				i++;
			}
		}
	}
}
