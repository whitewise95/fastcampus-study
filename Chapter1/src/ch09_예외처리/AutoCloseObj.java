package ch09_예외처리;


/*
 * 자바 9 이상부터는 AutoCloseable 를 구현하여 close() 메소드를 만들 수 있다.
 * AutoCloseTest 클래스에서 확인하자
 * 
 * */
public class AutoCloseObj implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되었습니다");
	}
}
