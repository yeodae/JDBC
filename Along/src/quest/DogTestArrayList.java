package quest;

import java.util.ArrayList;

public class DogTestArrayList {
	public static void main(String[] args){
		
		ArrayList<Dog> list = new ArrayList<Dog>();
		list.add(new Dog("�۸���","ġ�Ϳ�"));
		list.add(new Dog("�ǻ�","������"));
		list.add(new Dog("����","��Ƽ��"));
		list.add(new Dog("�÷�","�ù��̴�"));
		list.add(new Dog("�Ƹ�","���"));
		
		for(int i = 0; i<list.size(); i++){
			System.out.println(list.get(i).showDogInfo());
		}
		System.out.println("===================");
		for(Dog dog : list){
			System.out.println(dog.showDogInfo());
		}
	}
}
