package day4_test;

public class Grade {
	int math;
	int science;
	int english;
	
	public Grade(int math, int science, int english){
		this.english=english;
		this.math=math;
		this.science=science;
	}
	public int average(){
		int average = (math+science+english)/3;
		return average;
	}
	
	
}
