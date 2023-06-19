package day7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_String {

	public static void main(String[] args) {
		//문자열만 삽입가능한 ArrayList 컬렉션 생성
		ArrayList<String> a = new ArrayList<>();
		
		//키보드로부터 4개의 이름 입력받아 ArrayList에 삽입
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<4; i++){
			System.out.println("임의의 이름을 입력하세요");
			String n = s.next();
			a.add(n);
		}
		
		//ArrayList에 들어 있는 모든 이름 출력
		for(int i=0; i<a.size(); i++){
			System.out.println(a.get(i));
		}
		
		//가장 긴 이름 출력
		int temp=0;
		for(int i=1; i<a.size(); i++){
			if(a.get(i).length()>a.get(temp).length()){
				temp=i;
			}
		}
		
		System.out.println("가장 긴 이름은 : "+a.get(temp));

	}

}
