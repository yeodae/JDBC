package day6_2;

public class Wrapper {//기본 타입의 값을 객체로 다룰 수 있게 함
	public static void main(String[] args) {

		String a= "100"; // 문자열 a
		int b = Integer.parseInt(a);
		// 문자열 a를 10진 정수로 변환
		System.out.println(b);

		String money="10,000";
		money = money.replace(",","");//,표 제거
		int c = Integer.parseInt(money);
		System.out.println(c); //10000 출력
		
		//=========박싱과 언박싱===========
		
		int n = 10;
		Integer intObject = n; // 박싱 
		System.out.println("intObject = "+intObject);
		
		int m = intObject + 10; // 언박싱
		System.out.println("m = "+m);
		
		//========스트링 리터럴과 new String();========
		String s1 = "홍길동";
		String s2 = "홍길동"; //==s1 같은 리터럴
		String s3 = new String("홍길동");
		
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3));//true
		//equals는 순수 문자열비교 ~ 무조건 이거써라
		
//		s1 = s1 + " 바보 ";
		s1 = s1.concat(" 바보"); //문자열을 이어붙일수 있다.
		System.out.println(s1);
		
		//다양한 String 메서드 활용
		String j1 = "  Java Programming  ";
		System.out.println(j1.toLowerCase());//소문자
		System.out.println(j1.toUpperCase());//대문자
		System.out.println(j1.trim());//앞뒤 공백제거
		
		System.out.println(j1.trim().toLowerCase());
		
		//문자열 비교 : int compareTo(String anotherString)
		//먼저나오면 음수리턴, 나중에 나오면 양수리턴
		String java = "Java";
		String cpp = "C++";
		int res = java.compareTo(cpp);
		if(res == 0){ // java가 c++보다 사전에 나중에 나오기때문에 양수 리턴
			System.out.println("the same");
		}else if(res < 0){
			System.out.println(java + " < " + cpp);
		} else 
			System.out.println(java + " > "+cpp);
		
		//문제 >> class compareTo
		//스캐너로 두개의 문자열 입력받기
		//소문자는 대문자로 바꿔서 비교
		//Test, test는 값은 값
		
		
	}
}
