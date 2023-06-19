package day9;

import java.util.*;

public class Collection_Arr {
	//���� 5�� ��ĳ�ʷ� �Է¹޾� ArrayList�� ����
	//Collections Ŭ������ Sort�� �̿��� ����
	//��� ex, 3->5->6->8->10
	static void printList(ArrayList<Integer> list){
		Iterator<Integer> it = list.iterator();
		//���ڿ��� ����?
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
			System.out.println((i+1)+"��° ���ڸ� �Է����ּ���");
			int num;
			num=scan.nextInt();
			list.add(num);
		}
		System.out.println("���� ���� �� : ");
		printList(list);
		Collections.sort(list); // �迭����
		System.out.println("���� ���� �� : ");
		printList(list);
		
		Collections.reverse(list);
		printList(list); //�ݴ�����
		
		int index =Collections.binarySearch(list, 3)+1;
		System.out.println(index);//������ �� ���¿��� �˻��ؾ� ���������� �ȴ�.
	}

}
