package day7_extends;

public class StudentWorker extends Student {
	private int empNum; // 사번
	void work(){
		System.out.println("일하기");
	}
	void info(){
		System.out.println("직장인 입니다.");
	}
	public static void main(String[] args) {
		StudentWorker w = new StudentWorker();
		w.say();
		w.eat();
		w.walk();
		w.sleep();
		w.study();
		w.work();
	}
}
