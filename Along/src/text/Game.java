package text;
import java.util.*;
public class Game {

	public int input(String name){
	
	
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("시작");
		scan.nextLine();
		Calendar now = Calendar.getInstance();
		int sec = now.get(Calendar.SECOND);
		System.out.println(name+"현재 초 : "+sec);
		System.out.println("10초에 가깝게 enter");
		scan.nextLine();
		now = Calendar.getInstance();
		int sec2 = now.get(Calendar.SECOND);
		System.out.println(name+"마지막 초 : "+sec2);
		
		int sum = (sec2 > sec) ? sec2-sec : (sec2-60) - sec ;
		int num1 = Math.abs(10-sum);
		System.out.println(name+"차이는 "+sum);
		return num1;
	
		
	}
}
