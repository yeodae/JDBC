package day4_test;

public class IPTV extends ColorTV {
	private String ip;

	public IPTV(String ip, int size, int color) {
		super(size, color); //상위 생성자 소환
		this.ip=ip;
	}
	protected String getIp(){
		return ip;
	}
	public void printProperty(){//오버라이딩
		System.out.println("나의 IPTV는 "+getIp()+" 주소의 "+getSize()+"인치"+getColor()+"컬러 TV");
		//구분이 안갈 수 있기 때문에 아래처럼 사용가능.
		System.out.print("나의 IPTV는 "+getIp()+" 주소의 ");
		super.printProperty();
	}
}
//결과 : 나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러