package day3;
import java.util.Scanner;
public class Rectangle {
	int width;
	int height;
	
	public int getArea(){
		return width*height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		Scanner scan = new Scanner(System.in);
		System.out.println("너비를 입력해주세요>>");
		rect.width = scan.nextInt();
		System.out.println("높이를 입력해주세요>>");
		rect.height= scan.nextInt();
		System.out.println("면적의 값 : "+rect.getArea());
		scan.close();//OS자원을 다시 되돌리는것.

	}

}
