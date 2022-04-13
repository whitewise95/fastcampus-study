package ch03;

import ch02.Student;

// String.concat() �� ��� �����޸𸮰� �ٲ�°� �ƴ϶� ���ο� �޷θ��� �����.
public class StringTest {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		String java = new String("java");
		String android = new String("android");
		
		
		System.out.println(System.identityHashCode(java)); // 705927765
		 
		java = java.concat(android);
		
		System.out.println(System.identityHashCode(java));  // 366712642
		
		
	}
}
