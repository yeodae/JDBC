package text;

abstract class Test66 {
	abstract public void aa(); // 추상메서드
	public void bb(){//일반메서드
		System.out.println("일반메서드 호출");
	}
}
class abss extends Test66{
	public void aa(){
		System.out.println("추상메서드 호출");
	}
}
public interface abstructss{
	

 public static void main(String[] args){
	 abss a=new abss();
	 a.aa();
	 a.bb();
 }
}
