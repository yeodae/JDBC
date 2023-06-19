package text;
import java.util.Scanner;
public class text1 {
public static void main(String[] args) {
	int days=0;
	Scanner scanner = new Scanner(System.in);
	System.out.print("달을 입력하세요");
	int month = scanner.nextInt();
	
	if(month>12 || month<1){
		System.out.println("1~12월 사이만 입력해주세요.");
	} else {
		switch(month){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			days=31;
			break;
		case 2:
			days=28;
			break;
		case 4: case 6: case 9: case 11:
			days=30;
		}
		System.out.println(month+"월은 "+days+"일 까지 입니다.");
	}
}
}
