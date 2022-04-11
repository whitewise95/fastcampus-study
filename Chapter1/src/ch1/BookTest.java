package ch1;

//   toString()에 대해 내용 
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
		
		Book book = new Book("데미안", "헤르만 허세");
		
		System.out.println(book);  //  toString이 override 안되었을 경우 ch1.Book@2a139a55  패키지 명.클래스명@16진수(가상 메모리주소) 
		
		String str = new String("test");
		
		System.out.println(str); // test  str는 왜 주소가 아닌 test로 나오는가? 그 이유는 toString() 메소드가 이미 오버라이딩 되어있기 때문이다.



	}

}
