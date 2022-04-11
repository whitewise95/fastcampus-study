package ch3;

import ch2.Student;

// String.concat() 할 경우 기존메모리가 바뀌는게 아니라 새로운 메로리가 생긴다.
public class StringTest {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		String java = new String("java");
		String android = new String("android");
		
		
		System.out.println(System.identityHashCode(java)); // 705927765
		 
		java = java.concat(android);
		
		System.out.println(System.identityHashCode(java));  // 366712642
		
		
	}
}
