package day9_2;

import java.util.*;

public class TimeGame {
	public static void main(String[] args) {
		// ���� �������� ����ð����ϱ�
		// �ι��� ���� �������� ����ð�
		// ���� ���� ���ϱ�

		Scanner s = new Scanner(System.in);
		System.out.print("1p���� ������");
		s.nextLine();
		Calendar now = Calendar.getInstance();//����� �ʱ�ȭ
		int s1 = now.get(Calendar.SECOND);
		System.out.println("���� �� : " + s1);
		System.out.println("10�ʿ� ������ enter ������");
		s.nextLine();
		now = Calendar.getInstance();
		int s2 = now.get(Calendar.SECOND);
		System.out.println("������ �� : " + s2);
		int sum1 = (s2 > s1) ? s2 - s1 : (s2 + 60) - s1;
		System.out.println("���� ���̴� " + sum1);

		
		
		System.out.print("2p���� ������");
		s.nextLine();
		now = Calendar.getInstance(); //����� �ʱ�ȭ
		int s3 = now.get(Calendar.SECOND);
		System.out.println("���� �� : " + s3);
		System.out.println("10�ʿ� ������ enter ������");
		s.nextLine();
		now = Calendar.getInstance();
		int s4 = now.get(Calendar.SECOND);
		System.out.println("������ �� : " + s4);
		int sum2 = (s4 > s3) ? s4 - s3 : (s4 + 60) - s3;
		System.out.println("���� ���̴� " + sum2);

		int num1=Math.abs(10-sum1);
		int num2=Math.abs(10-sum2);
		
		if(sum1==sum2){
			System.out.println("���");
		}else if(num1<num2){
			System.out.println("1p�̱�");
		}else{
			System.out.println("2p�̱�");
		}

	}
}

