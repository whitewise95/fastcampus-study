package ch01;

//   toString()�� ���� ���� 
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
		
		Book book = new Book("���̾�", "�츣�� �㼼");
		
		System.out.println(book);  //  toString�� override �ȵǾ��� ��� ch1.Book@2a139a55  ��Ű�� ��.Ŭ������@16����(���� �޸��ּ�) 
		
		String str = new String("test");
		
		System.out.println(str); // test  str�� �� �ּҰ� �ƴ� test�� �����°�? �� ������ toString() �޼ҵ尡 �̹� �������̵� �Ǿ��ֱ� �����̴�.



	}

}
