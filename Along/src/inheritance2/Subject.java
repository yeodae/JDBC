package inheritance2;

public class Subject {
	private int subjectID;
	private int subjectName;
	
	public int getSubjectID(){
		return subjectID;
	}
	public void setSubjectID(int subjectID){
		this.subjectID = subjectID;
	}
	public int getSubjectName(){
		return subjectName;
	}
	public void setSubjectName(int subjectName){
		this.subjectName = subjectName;
	}
	public void showSubjectInfo(){
		System.out.println(subjectID + " , " + subjectName);
	}

}
