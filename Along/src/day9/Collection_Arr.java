package day9;

import java.util.*;

public class Collection_Arr {
	//숫자 5개 스캐너로 입력받아 ArrayList에 저장
	//Collections 클래스의 Sort를 이용해 저장
	//출력 ex, 3->5->6->8->10
	static void printList(ArrayList<Integer> list){
		Iterator<Integer> it = list.iterator();
		//문자열을 정렬?
		while(it.hasNext()){
			int v = it.next();
			String separator;

			if(it.hasNext()){
				separator = "->";
			}else{
				separator = "\n";
			}
			System.out.print(v+separator);
		}
	}



	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);

		for(int i=0; i<5; i++){
			System.out.println((i+1)+"번째 숫자를 입력해주세요");
			int num;
			num=scan.nextInt();
			list.add(num);
		}
		System.out.println("정렬 실핼 전 : ");
		printList(list);
		Collections.sort(list); // 배열정렬
		System.out.println("정렬 실행 후 : ");
		printList(list);
		
		Collections.reverse(list);
		printList(list); //반대정렬
		
		int index =Collections.binarySearch(list, 3)+1;
		System.out.println(index);//정렬이 된 상태에서 검색해야 정상적으로 된다.
	}

}
