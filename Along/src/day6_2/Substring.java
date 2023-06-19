package day6_2;
import java.util.*;
public class Substring {
	public static void main(String[] args) {
		//주민번호를 입력받아서 남자인지 여자인지 판별
//		                   123456789
//		String Substring = "940823-1234567";
		Scanner s = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요.");
		String input = s.next().substring(7,8);
				
		if(input.equals("1") || input.equals("3")){
			System.out.println("남성입니다.");
		}else if(input.equals("2") || input.equals("4")){
			System.out.println("여성입니다.");
		}else{
			System.out.println("다시 입력해주세요.");
		}
		
//		Scanner s = new Scanner(System.in);
//		String input = s.next();
//		if(input.length() != 14){
//			System.out.println("다시 입력(14글자)");
//			return;
//		}
//		if(input.substring(7,8).equals("1")
//				|| input.substring(7,8).equals("3")){
//			System.out.println("남자");
//		}
//		else{
//			System.out.println("여자");
//		}
	}
}
