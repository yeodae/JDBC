package text;
import java.util.*;
public class Game {

	public int input(String name){
	
	
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("����");
		scan.nextLine();
		Calendar now = Calendar.getInstance();
		int sec = now.get(Calendar.SECOND);
		System.out.println(name+"���� �� : "+sec);
		System.out.println("10�ʿ� ������ enter");
		scan.nextLine();
		now = Calendar.getInstance();
		int sec2 = now.get(Calendar.SECOND);
		System.out.println(name+"������ �� : "+sec2);
		
		int sum = (sec2 > sec) ? sec2-sec : (sec2-60) - sec ;
		int num1 = Math.abs(10-sum);
		System.out.println(name+"���̴� "+sum);
		return num1;
	
		
	}
}
