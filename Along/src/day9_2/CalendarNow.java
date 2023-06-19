package day9_2;

import java.util.Calendar;

public class CalendarNow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		int year = now.get(1); // now에 저장된 년도
		int month = now.get(Calendar.MONTH) + 1; // now에 저장된 달
		
		System.out.println(year+"/"+month);
		
		Calendar firstDate = Calendar.getInstance();
		
		firstDate.clear();//정보 초기화
		firstDate.set(2016, 11, 25);
		firstDate.set(Calendar.HOUR_OF_DAY,20);
		firstDate.set(Calendar.MINUTE, 30);
		
	}

}
