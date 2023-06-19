package day6_2;
import java.util.Scanner;
public class compareTo {
	public static void main(String[] args) {
		
		//문제 >>
				//스캐너로 두개의 문자열 입력받기
				//소문자는 대문자로 바꿔서 비교
				//Test, test는 값은 값
		Scanner s = new Scanner(System.in);
		System.out.println("2개 문자열 입력>>");
		String a=s.nextLine().toUpperCase();//대문자변환
		String b=s.nextLine().toUpperCase();//대문자변환
		// nextLine() ~ 띄어쓰기 해도 해당라인 전체 출력
		int res = a.compareTo(b);
		if(res == 0){
			System.out.println("the same");
		}else if(res < 0){
			System.out.println(a +" < "+b);
		}else
			System.out.println(a + " > "+b);
		//a가 먼저오면 음수리턴 a<b
		//a가 나중에 나오면 양수리턴 a>b
		//======================
		
//		String s1 = "\t test \n";
//		String s2 = "   test   ";
//		System.out.println(s1.trim());
//		System.out.println(s2.trim()); //trim연습
	}

}
