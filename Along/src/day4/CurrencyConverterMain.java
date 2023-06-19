package day4;
import java.util.Scanner;
public class CurrencyConverterMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("환율(1달러)>> ");
		double rate=scan.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $"+CurrencyConverter.toDollar(1000000)+"원 입니다.");
		System.out.println("$100는 "+CurrencyConverter.toKWR(100)+"원 입니다.");
	}
}
