package ch2;

public class Student implements Cloneable{
	private int studentNum;
	private String studentName;
	
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	public String toString() {
		
		return studentNum + " " + studentName;
		
	}

	
	// hashCode 값은 int값이 되기때문에 studentNum넘겨줘 알 수 있다.
	@Override
	public int hashCode() {
		
		return studentNum;
	}

	
	// 매개변수로 받은 객체를 instanceof로 형변환이 가능한지 체크 후 변환 한 뒤 this.studentNum == std.studentNum 로 확인
	@Override
	public boolean equals(Object obj) {
			if(obj instanceof Student) {
				Student std = (Student)obj;
				if(this.studentNum == std.studentNum) {
					return true;
				}
			} else {
				return false;
			}
		return false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
	
	
}
