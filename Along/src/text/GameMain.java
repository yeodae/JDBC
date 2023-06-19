package text;

public class GameMain {
	public static void main(String[] args) {
		Game G = new Game();
		int num = G.input("È«±æµ¿");
		int num2 = G.input("ÀÌ¹«±â");
		
		if(num > num2){
			System.out.println("ÀÌ¹«±â½Â¸®");
		}else if(num2 == num){
			System.out.println("µ¿Á¡!");
		}else{
			System.out.println("È«±æµ¿ ½Â¸®!");
		}
	
	}
}
