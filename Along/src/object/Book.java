package object;

public class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber=bookNumber;
		this.bookTitle=bookTitle;
	}//책 번호와 제목을 매개변수로 입력받는 생성자

	@Override//toString() 메서드 재정의
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
		return bookTitle + "," + bookNumber;
	}
}



