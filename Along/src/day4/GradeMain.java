package day4;
import java.util.Scanner;
public class GradeMain {
	
	public static void main(String[] args) {
		   // TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
		   System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
		   int math = sc.nextInt();
		   int science = sc.nextInt();
		   int english = sc.nextInt();
		   Grade me = new Grade(math, science, english);
		   System.out.println("평균은 "+me.average()); // average()는 평균을 계산하여 리턴   
		   sc.close();
		}
//		결과 : 수학, 과학, 영어 순으로 3개의 정수 입력 >> 90 88 96
//				평균은 91
	

	}
	


