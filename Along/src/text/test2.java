package text;
import java.util.Scanner;
public class test2 {
	public static void main(String[] args) {
		char grade = ' ';
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요.");
		int score = scanner.nextInt();

		if(score<=100 && score>=90){
			grade = 'A';
		}else if(score >=80){
			grade = 'B';
		}else if(score >=70){
			grade = 'C';
		}else if(score >=60){
			grade = 'D';
		}else{
			grade = 'F';
		}
		System.out.println("당신의 학점은 "+grade+"입니다.");
	}
}
