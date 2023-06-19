package quest;

import java.util.ArrayList;

public class DogTestArrayList {
	public static void main(String[] args){
		
		ArrayList<Dog> list = new ArrayList<Dog>();
		list.add(new Dog("멍멍이","치와와"));
		list.add(new Dog("뽀삐","진돗개"));
		list.add(new Dog("우유","말티즈"));
		list.add(new Dog("시루","시바이누"));
		list.add(new Dog("아리","비숑"));
		
		for(int i = 0; i<list.size(); i++){
			System.out.println(list.get(i).showDogInfo());
		}
		System.out.println("===================");
		for(Dog dog : list){
			System.out.println(dog.showDogInfo());
		}
	}
}
