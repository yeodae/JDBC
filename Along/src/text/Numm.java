package text;
import java.util.Scanner;
public class Numm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민번호");
		String str=scanner.next();
		String num=str.substring(7,8);
		
		if(num.equals("1") || num.equals("3")){
			System.out.println("남");
		} else if(num.equals("2") || num.equals("4")){
			
		}
		
	}
}
