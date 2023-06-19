package text;

public class exception {
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		
		try{
			if(num%2==0){
				System.out.println(num+"´Â Â¦¼ö");
			}else{
				System.out.println(num+"´Â È¦¼ö");
			}
			
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("main finallyÀý");
		}
	}
}
