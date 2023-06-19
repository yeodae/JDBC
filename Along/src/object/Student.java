package object;

public class Student {
	int studentID;
	String name;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	public String toString(){
		return studentID + "," + name;
	}
	
	//equals() 메서드 재정의하기 ===========
		@Override
		public boolean equals(Object obj){
			if(obj instanceof Student){
				Student std = (Student)obj;
				
				if(this.studentID == std.studentID){
					return true;
				}//재정의한 equals()메서드는 학생의 학번이 같으면 true
			}else{
				return false;
			}
			return false;
		}//equals() 메서드 재정의하기 ===========
		
		@Override//hashCode() 메서드 재정의하기==========
		public int hashCode(){
			return studentID;
		}
	
	
	
}
