package text;
//ȥ���� �߻�Ŭ����

abstract class TT{//�߻�Ŭ����
	int age;//��������
	
	public TT(){}//����Ʈ������
	
	public TT(int age){//�����ִ� ������
		this.age = age;
	}
	
	public void kk(){//�Ϲݸ޼���
		System.out.println("kk �Ϲݸ޼��� ȣ��");
	}
	public abstract void disp();//�߻�޼���
	
	//�޼���
}


public class abstractT extends TT{
	public abstractT(int age){
		super(age);
	}
 
@Override
public void disp() {//�߻�޼��� �������̵�
	System.out.println("disp() �߻�޼��� �������̵�");
	System.out.println("age : "+age);
}

public static void main(String[] args) {
 TT t=new abstractT(63);
 t.kk();
 t.disp();
}
}