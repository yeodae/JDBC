package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonTest {
	public static void main(String[] args) {
		Class personClass = Person.class;
		
		Constructor[ ] cons = personClass.getConstructors();
		for(Constructor c : cons){
			System.out.println(c);
		}
		System.out.println();
		
		Method[ ] method = personClass.getMethods();
		for(Method m : method){
			System.out.println(m);
		}
		System.out.println();
		
		Field[ ] field = personClass.getFields();
		for(Field f : field){
			System.out.println(f);
		
			System.out.println(f.getName());
		}
	}

}
