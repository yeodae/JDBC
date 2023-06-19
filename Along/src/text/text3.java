package text;

public class text3 {
	public static void main(String[] args) {
		/*	int score[][]={
				{70,80,90},
				{80,90,100},
				{77,88,99}
		};
		int sum=0;

		for(int i=0; i<score.length; i++){
			for(int j=0; j<score[i].length; j++){
				System.out.print(score[i][j] + " ");
				sum+=score[i][j];
			}
			System.out.println("=>" + sum);
			sum=0;
		}*/
		String name[]={"±è¾¾","¹Ú¾¾","ÃÖ¾¾"};
		int score[][]={
				{70,80,90},
				{80,90,100},
				{77,88,99}
		};
		int sum=0;

		for(int i=0; i<score.length; i++){
			System.out.print(name[i] + " : ");
			for(int j=0; j<score[i].length; j++){
				System.out.print(score[i][j] + " ");
				sum+=score[i][j];
			}			
			System.out.println(" => "+sum);
			sum=0;
		}
	}
}
