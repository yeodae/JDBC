package day9;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ&ȫ��/����&����", "/&");
		String str = s.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		System.out.println("���� ������"+st.countTokens());;
//		StringTokenizer st = new StringTokenizer(s.nextLine());
//		//("ȫ�浿 ��ȭ ȫ�� ���� ����")���� ���� ��� �ڵ��и�
//		int c = 0;
//		while (st.hasMoreTokens()){
//			System.out.println(st.nextToken());
//			c++;
//		}
//		System.out.println("���� ������ "+c);
	}
}
