package day9.Test;
import java.util.*;
public class Test4 {
	public static void main(String[] args) {
		Random r=new Random();
		Scanner s=new Scanner(System.in);
		int score=0;

		for(int i=0; i<5; i++){
			int a=r.nextInt(8)+2;
			int b=r.nextInt(9)+1;
			int num=a*b;
			System.out.println(a+"*"+b+"=");
			if(s.nextInt()==num){
				System.out.println("�����Դϴ�.");
				score+=20;
			}else{
				System.out.println("�����Դϴ�.");
			}
		}
		System.out.println("��"+score+"���Դϴ�.");
	}

}
