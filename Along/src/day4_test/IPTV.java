package day4_test;

public class IPTV extends ColorTV {
	private String ip;

	public IPTV(String ip, int size, int color) {
		super(size, color); //���� ������ ��ȯ
		this.ip=ip;
	}
	protected String getIp(){
		return ip;
	}
	public void printProperty(){//�������̵�
		System.out.println("���� IPTV�� "+getIp()+" �ּ��� "+getSize()+"��ġ"+getColor()+"�÷� TV");
		//������ �Ȱ� �� �ֱ� ������ �Ʒ�ó�� ��밡��.
		System.out.print("���� IPTV�� "+getIp()+" �ּ��� ");
		super.printProperty();
	}
}
//��� : ���� IPTV�� 192.1.1.2 �ּ��� 32��ġ 2048�÷�