package day9_2;

import java.util.Calendar;

public class CalendarNow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		int year = now.get(1); // now�� ����� �⵵
		int month = now.get(Calendar.MONTH) + 1; // now�� ����� ��
		
		System.out.println(year+"/"+month);
		
		Calendar firstDate = Calendar.getInstance();
		
		firstDate.clear();//���� �ʱ�ȭ
		firstDate.set(2016, 11, 25);
		firstDate.set(Calendar.HOUR_OF_DAY,20);
		firstDate.set(Calendar.MINUTE, 30);
		
	}

}
