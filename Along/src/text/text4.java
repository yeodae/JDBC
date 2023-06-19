package text;

public class text4 {
	public static void main(String[] args) {
		//while문,if문 : 1~10까지 짝수만 출력
		int i=0;
		while(i<=10){
			if(i%2==0){
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
		//do~while문 : 10~20까지 3의배수만 출력
		i=10;
		do{
			if(i%3==0){
				System.out.print(i+" ");
			}
			i++;
		}while(i<=20);

	}
}
