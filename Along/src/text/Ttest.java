package text;
//����Ŭ����
class SuperMan{
	//��������
	public String name;
	public int age;

	//������
	public SuperMan(){}//����Ʈ������
	public SuperMan(String name,int age){
		this.name=name;
		this.age=age;
	}

	//�޼���
	public void disp(){
		System.out.println("�̸� : "+ name);
		System.out.println("���� : "+age);
	}

}
//�Ļ�Ŭ����
class SuperBoy extends SuperMan{
	//��������
	public String grade;

	//������
	public SuperBoy(){}
	public SuperBoy(String grade,String name,int age){
		super(name,age);
		this.grade=grade;
	}
	//�޼���
	public void disp(){
		System.out.println("�̸�: "+ name);
		System.out.println("����: "+ age);
		System.out.println(grade+"�б� �������Դϴ�.");
	}
}

//�Ļ�Ŭ����
class Supermom extends SuperMan{
	//��������
	public String addr;

	public Supermom(){}
	public Supermom(String addr,String name,int age){
		super(name,age);
		this.addr=addr;
	}

	public void disp(){
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
		System.out.println("��°�: "+addr);
	}

	public void boom(){
		System.out.println("boom!");
	}
}


public class Ttest {
	public static void main(String[] args) {
		SuperMan s = new SuperMan("�����̴���",25);
		s.disp(); //����Ŭ���� ȣ��
		System.out.println();//�ٹٲ�
		
		s=new SuperBoy("�ʵ�","����",13);
		s.disp();//�Ļ�1 ȣ��
		System.out.println();//�ٹٲ�
		
		s=new Supermom("�츮��","�Ƿη�",30);
		s.disp();
		
		((Supermom)s).boom();
	}
}
