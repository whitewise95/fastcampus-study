package ch10_사용자Exception;


/*
 * PasswordException 를 상속받아 예외처리를 직접 만들 수 있다.
 * */
public class PasswordException extends IllegalArgumentException{
	
	public PasswordException(String message) {
		super(message);
	}
}
