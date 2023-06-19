package day9;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		StringTokenizer st = new StringTokenizer("È«±æµ¿/ÀåÈ­&È«·Ã/ÄáÁã&ÆÏÁã", "/&");
		String str = s.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		System.out.println("¾îÀı °³¼ö´Â"+st.countTokens());;
//		StringTokenizer st = new StringTokenizer(s.nextLine());
//		//("È«±æµ¿ ÀåÈ­ È«·Ã ÄáÁã ÆÏÁã")°ø¹é °°Àº °æ¿ì ÀÚµ¿ºĞ¸®
//		int c = 0;
//		while (st.hasMoreTokens()){
//			System.out.println(st.nextToken());
//			c++;
//		}
//		System.out.println("¾îÀı °³¼ö´Â "+c);
	}
}
