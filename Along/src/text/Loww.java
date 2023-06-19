package text;
import java.util.Scanner;
public class Loww {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("주민번호입력");
	String num = scanner.next();
	String no = num.substring(7,8);
	int s =Integer.parseInt(no);
	
	if(s==1 || s==3){
		System.out.println("남자");
	} else if(s==2 || s==4){
		System.out.println("여자");
	}
}
}
