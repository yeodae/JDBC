package quest;

public class DogTest {
public static void main(String[ ] args){
	Dog[] dogArray = new Dog[5];
	dogArray[0] = new Dog("��Ƽ��","����");
	dogArray[1] = new Dog("���","����");
	dogArray[2] = new Dog("����","���");
	dogArray[3] = new Dog("��������","����");
	dogArray[4] = new Dog("Ǫ��","����");
	
	for(int i = 0; i<dogArray.length; i++){
		dogArray[i].showDogInfo( );
	}
	
	for(Dog dog : dogArray) {
		System.out.println(dog.showDogInfo());
	}
	
	
}
}
