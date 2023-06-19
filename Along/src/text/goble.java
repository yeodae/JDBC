package text;

public class goble {
	public static void main(String[] args) {
		String name = "홍길동";	//
		int age = 30;
		double height = 165.2;
		double weight = 60.4;
		boolean flg = true; // true of false
		// &&and ||or
		if(height >= 180 && weight >=60){
			System.out.println("키가 180이상 입니다.");
		} else {
			System.out.println("키가 180이하 입니다.");
		}
		
		/*if(height > 180){
			System.out.println("180이상");
		} else if (height > 170){
			System.out.println("170이상");
		} else if (height > 160){
			System.out.println("160이상");
		}*/

		/*if(flg){
			System.out.println("flg는 트루");
		}
		flg=false;
		if(flg){
			System.out.println("flg는 트루");
		} else {
			System.out.println("flg는 펄스");
		}*/


	}
}
