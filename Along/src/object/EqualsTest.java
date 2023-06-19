package object;

public class EqualsTest {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentYeo=new Student (100,"여대현");
		Student studentLee= studentYeo;//주소 복사
		Student studentSang=new Student(100,"여대현");
		
		if(studentYeo == studentLee){//==기호로 비교
			System.out.println("주소 studentYeo == studentLee");
		}else{
			System.out.println("주소 studentYeo != studentLee");
		}
		
		if(studentYeo.equals(studentLee)){//메서드로 비교
			System.out.println("동일합니다.studentYeo.equals(studentLee)");
		}else{System.out.println(
			"동일하지 않습니다. studentYeo.equals(studentLee)");
		}
		
		if(studentYeo == studentSang){
			System.out.println("주소 studentYeo == studentSang");
		} else{
			System.out.println("주소 studentYeo != studentSang");
		}
		if(studentYeo.equals(studentSang)){
			System.out.println("동일한 studentYeo.equals(studentSang");
		}else{
			System.out.println("동일하지 않은 studentYeo.equals(studentSang");
		}
		
		System.out.println("studentYeo의 hashCode : "+studentYeo.hashCode());
		System.out.println("studentSang의 hashCode : "+studentSang.hashCode());
		//두 학생은 논리적으로 같기 때문에 같은 해시코드값을 반환한다.
		System.out.println("studentYeo의 실제 주소값 : "+System.identityHashCode(studentYeo));
		System.out.println("studentSang의 실제 주소값 : "+System.identityHashCode(studentSang));
		//논리적으로는 같지만, 실제 메모리 주소값으로는 다른 인스턴스이다.
	}

}
