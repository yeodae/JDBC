package text;

public class TV {
	//�Ű�����
	String name;
	int year;
	int size;
	
	TV(String name,int year,int size){
		this.name=name;
		this.year=year;
		this.size=size;
	}
	void show(){
		System.out.println(name+"���� ���� "+year+"���� "+size+"��ġ TV");
	}
	
	
}
