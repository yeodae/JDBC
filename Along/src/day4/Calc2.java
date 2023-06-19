package day4;

public interface Calc2 {
	public static double max(double a,double b){
		return (a > b) ? a : b;
	}
	public static String strMax(String a,String b){
		return (a.length() > b.length()) ? a : b;
	}
	public static char chMax(char ch,char ch2){
		return (ch>ch2) ? ch : ch2;
	}
	public static int strMaxLen(String str1, String str2){
		return (str1.length()>str2.length()) ? str1.length() : str2.length();
	}
}
