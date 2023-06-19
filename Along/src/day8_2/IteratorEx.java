package day8_2;
import java.util.*;
public class IteratorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		//v에 숫자 5개 입력

		v.add(5);
		v.add(3);
		v.add(2);
		v.add(4);
		v.add(1);

		//for(int i=0; i<v.size(); i++){
		//System.out.println(v.get(i));
		//}
		Iterator<Integer> it = v.iterator();
		// [5,3,2,4,1]
		while(it.hasNext()){//true~현it위치:-1→0번째가 있으므로 
			System.out.println(it.next());
			
		}
		//ArrayList<String> 생성
		//문자열 5개 스캐너로 입력 받아서 저장
		//Iterator 객체를 통해서 출력

		ArrayList<String> a = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		for(int i=0; i<5; i++){
			System.out.println((i+1)+"번째 문자입력");
			a.add(s.next());
		}
		System.out.println(a);
		Iterator<String> str = a.iterator();
		while(str.hasNext()){
			System.out.println(str.next());
		}
	}

}
