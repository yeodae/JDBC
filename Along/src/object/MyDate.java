package object;

public class MyDate {
	int day;
	int month;
	int year;

	public MyDate(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override//equals()메서드로 재정의
	public boolean equals(Object obj){
		if (obj instanceof MyDate){
			MyDate md = (MyDate)obj;

			return (this.day==md.day && this.month==md.month && this.year==md.year);
		} else {
			return false;
		}
	}
	@Override//hashCode()메서드로 재정의
	public int hashCode(){
		return day * 10 + month * 101 + year * 102;
	}

}
