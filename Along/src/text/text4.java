package text;

public class text4 {
	public static void main(String[] args) {
		//while��,if�� : 1~10���� ¦���� ���
		int i=0;
		while(i<=10){
			if(i%2==0){
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
		//do~while�� : 10~20���� 3�ǹ���� ���
		i=10;
		do{
			if(i%3==0){
				System.out.print(i+" ");
			}
			i++;
		}while(i<=20);

	}
}
