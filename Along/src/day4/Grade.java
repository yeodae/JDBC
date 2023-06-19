package day4;

public class Grade {
	int math;
	int science;
	int english;

	Grade(int math, int science, int english){
		this.math=math;
		this.science=science;
		this.english=english;
	}
	double average(){
		double avg=(math+science+english)/3;

		return avg;
	}
}
