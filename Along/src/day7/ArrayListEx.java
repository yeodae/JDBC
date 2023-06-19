package day7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		//ArrayList 문자열을 관리하는 객체 생성
		
		Scanner s = new Scanner(System.in);
		//Scanner로 문자열을 5개 입력받아서 ArrayList객체에 저장
		
		for(int i=0; i<5; i++){
			System.out.print("이름을 입력해주세요>>");
//			String in=s.next();
			a.add(s.next());
			}
		for(int i=0; i<a.size(); i++){
			System.out.println("이름 : "+a.get(i));
			//ArrayList 객체에 있는 문자열 출력
		}

		int temp=0;
		for(int i=1; i<a.size(); i++){
			if(a.get(i).length() > a.get(temp).length()){
				temp=i;
				}
		}
		for(int i=0; i<a.size(); i++){
			if(a.get(temp).length()==a.get(i).length()){
				System.out.println(a.get(i));
			}
		}
//		System.out.println("가장 긴 이름은 : "+a.get(temp));
//		System.out.println();
		
//		String str="";
//		for( int i =0; i<a.size(); i++){
//			if(str.length() < a.get(i).length()){
//				str=a.get(i);
//			}
//		}
//		System.out.println("가장 긴 이름 : "+str);
	}
}
