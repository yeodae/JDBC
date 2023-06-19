package day3;

public class Book {
	String title;
	String author;

	public Book(String title){//생성자1
		this(title, "작자미상");//무조건 생성자의 첫줄에 와야한다.
//		this.title = title;//this.객체 = 해당객체를 의미
//		this.author = "작자미상"; 
//		System.out.println(title+" "+author);
	}
	public Book(String title, String author){//생성자2
		this.title = title;
		this.author = author;
		System.out.println(title+" "+author);
	}
}

