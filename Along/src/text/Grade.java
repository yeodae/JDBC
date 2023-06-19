package text;

public class Grade {
int math;
int science;
int english;

Grade(int math,int science,int english){
	this.math=math;
	this.science=science;
	this.english=english;
}

int average(){
	int avg=(math+science+english)/3;
	return avg;
	
}
}
