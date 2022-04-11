package ch2;

// equals 와 hashcode override 하는 내용
public class EaulsTest {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Student std1  = new Student(100, "Lee");
		Student std2  = new Student(100, "Lee");
		Student std3 = std1;
		
		System.out.println(std1 == std2);  // false 다른 객체이기 떼문에 
		
		System.out.println(std1.equals(std2)); // false 다른 객체이기 떼문에   만약 오버라이딩으로 재정의 해줬다면 true
		
		System.out.println(std3.equals(std1)); // true 주소값이 같기 때문에  
		
		System.out.println(std1.hashCode());  
		System.out.println(std2.hashCode());
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		
		
		System.out.println(str1.equals(str2));   // true
		System.out.println(str1.hashCode()); //96354
		System.out.println(str2.hashCode()); //96354
		
		Integer i = 100;
		System.out.println(i.hashCode()); // 100 int타입은  값이 hashCode가 됨
		
		System.out.println(System.identityHashCode(std1)); // 가상메모리값 705927765
		System.out.println(System.identityHashCode(std2)); // 가상메모리값 366712642
		
		
		
		//===========================================================================
		
		
		Student copySyudent = (Student)std1.clone(); // Student클래스에 Cloneable를 구현하고 clone를 override 해줘야한다.
		System.out.println(copySyudent.toString()); 
	
		
	}

}
