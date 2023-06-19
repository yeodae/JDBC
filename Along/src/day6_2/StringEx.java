package day6_2;

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		System.out.println(a + "의 길이는 " + a.length()); // 문자열의 길이(문자 개수)
		
		System.out.println(a.contains("#")); // 문자열의 포함 관계
		//문자열# 포함되어 true 출력
		
		a = a.concat(b); // 문자열 연결
		System.out.println(a); //C#,C++출력
		
		a = a.trim(); // 문자열 앞 뒤의 공백 제거
		System.out.println(a);
		
		a = a.replace("C#","Java"); // 문자열 대치=변경
		System.out.println(a); //Java,C++출력
		
		String s[] = a.split(","); //","기준 문자열 분리
		for (int i=0; i<s.length; i++)
			System.out.println("분리된 문자열" + i + ": " + s[i]);
		//분리된 문자열0: Java == 분리된 문자열1: C++
		
		a = a.substring(5); // 인덱스 5부터 끝까지 서브 스트링 리턴
		System.out.println(a); // C++ 출력
		char c = a.charAt(2); // 인덱스 2의 문자 리턴
		System.out.println(c);
	}
}
