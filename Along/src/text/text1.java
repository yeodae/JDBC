package text;
import java.util.Scanner;
public class text1 {
public static void main(String[] args) {
	int days=0;
	Scanner scanner = new Scanner(System.in);
	System.out.print("���� �Է��ϼ���");
	int month = scanner.nextInt();
	
	if(month>12 || month<1){
		System.out.println("1~12�� ���̸� �Է����ּ���.");
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
		System.out.println(month+"���� "+days+"�� ���� �Դϴ�.");
	}
}
}
