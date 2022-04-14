package ch10_사용자Exception;

class PasswordException extends IllegalAccessException{
	
	public PasswordException(String msg) {
		super(msg);
	}
	
}


class Member {
	private String password;

	public void setPassword(String password) throws PasswordException{
		if(password.length() > 1) {
			throw new PasswordException("에러메세지");
		}
		this.password = password;
	}
		
	public String getPassword() {
		return this.password;
	}	
}
	

public class test2 {
	
	public static void main(String[] args) {
		Member test = new Member();
		try {
			test.setPassword("ss");
		} catch (PasswordException e) {
			e.printStackTrace();
		}
		System.out.println(test.getPassword());
	}
}