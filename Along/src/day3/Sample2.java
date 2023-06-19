package day3;

public class Sample2 {
	public static void main(String[] args) {
		Circle[] cArray = new Circle[5];
		for(int i=0; i<cArray.length; i++){
			cArray[i]=new Circle(i);
		}

		ClassB classB = new ClassB();
		classB.setCandyNum(1000);
		System.out.println(classB.getCandyNum());
		classB.setIceNum(2000);
		System.out.println(classB.getIceNum());
	}
}
