package text;

abstract class Test66 {
	abstract public void aa(); // �߻�޼���
	public void bb(){//�Ϲݸ޼���
		System.out.println("�Ϲݸ޼��� ȣ��");
	}
}
class abss extends Test66{
	public void aa(){
		System.out.println("�߻�޼��� ȣ��");
	}
}
public interface abstructss{
	

 public static void main(String[] args){
	 abss a=new abss();
	 a.aa();
	 a.bb();
 }
}
