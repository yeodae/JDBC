package quest;

public class DogTest {
public static void main(String[ ] args){
	Dog[] dogArray = new Dog[5];
	dogArray[0] = new Dog("¸»Æ¼Áî","¸ğÂî");
	dogArray[1] = new Dog("ºñ¼õ","±¸¸§");
	dogArray[2] = new Dog("½ÃÃò","¶ó¸á");
	dogArray[3] = new Dog("½´³ª¿ìÀú","ÇÏÃ÷");
	dogArray[4] = new Dog("Çªµé","ÃÊÄÚ");
	
	for(int i = 0; i<dogArray.length; i++){
		dogArray[i].showDogInfo( );
	}
	
	for(Dog dog : dogArray) {
		System.out.println(dog.showDogInfo());
	}
	
	
}
}
