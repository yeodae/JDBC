package text;

public class lotto {

	public static void main(String[] args) {
		int lotto[]=new int[6];
		System.out.print("�ζ� ��ȣ: ");
		for(int i=0; i<lotto.length; i++){
			lotto[i] = (int)(Math.random()*45+1);
			
			//�ߺ�����
			for(int j=0; j<i; j++){
				if(lotto[i]==lotto[j]){
					i--;
					break;
				}
			}
		}
		for(int i=0; i<lotto.length; i++){
			System.out.print(lotto[i] + " ");
		}
		


		/*int lotto[]=new int[6];
		System.out.print("�ζǹ�ȣ : ");
		for(int i=0; i<6; i++){
			lotto[i] = (int)(Math.random()*45+1);
			for(int j=0; j<i; j++){
				if(lotto[i]==lotto[j]){
					i--;
					break;
				}
			}
		}
		for(int i=0; i<6; i++){
			System.out.print(lotto[i] + " ");
		}*/
	}
}
