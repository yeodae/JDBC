package day5_test;
import java.util.Scanner;

public class Km2Mile {
	Scanner s=new Scanner(System.in);
	private double km;
	double mile;

	Km2Mile(double km){
		this.km=km;
	}
	void run(){
		System.out.println("Km를 mile로 바꿉니다.");
		System.out.println("Km을 입력하세요>>");
		double mile=s.nextInt();
		System.out.println("변환 결과: "+mile/km+"mile입니다.");
	}
}
