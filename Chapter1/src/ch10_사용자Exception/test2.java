package ch10_사용자Exception;

class PasswordException2 extends IllegalAccessException{
	
	public PasswordException2(String msg) {
		super(msg);
	}
	
}


class Member {
	private String password;

	public void setPassword(String password) throws PasswordException2{
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
		} catch (PasswordException2 e) {
			e.printStackTrace();
		}
		System.out.println(test.getPassword());
	}
}