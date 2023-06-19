package day5_test;
import java.util.Scanner;
public class Won2Dollar {
	private int dol;
	Scanner s=new Scanner(System.in);
	
	Won2Dollar(int dol){
		this.dol=dol;
	}
	void run(){
		System.out.println("원을 달러로 바꿉니다.");
		System.out.println("원을 입력하세요>>");
		double avg=s.nextInt();
		System.out.println("변환 결과: "+avg/dol+"달러입니다.");
	}

	//원을 달러로 바꿉니다.
		//원을 입력하세요>> 24000
		//변환 결과: 20.0달러입니다
}
