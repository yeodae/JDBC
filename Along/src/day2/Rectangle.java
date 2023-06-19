package day2;
import java.util.Scanner;
public class Rectangle {
	int width;
	int height; //변수2개와 

	public int getArea() { // 하나의 메서드로 이루어진 클래스.
		return width * height;//면적계산
	}

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); // 객체 생성
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		System.out.println("사각형의 면적은 " + rect.getArea());
		scanner.close();//OS자원을 다시 되돌리는것.
	}
}
