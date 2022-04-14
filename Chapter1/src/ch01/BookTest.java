package ch01;

//   toString()을 해주면 객체여도 
class Book {
	
	private String title;
	private String author;
	
	
	
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}




	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	

}


public class BookTest {

	public static void main(String[] args) {
		
		Book book = new Book("제목", "김유신");
		
		System.out.println(book);  //  toString() 하기전에는 ch1.Book@2a139a55   패키지.클래스명@메모리주소 
		
		String str = new String("test");
		
		System.out.println(str); 



	}

}
