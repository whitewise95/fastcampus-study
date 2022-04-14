package ch02;

// equals 와 hashCode를 override 
public class EaulsTest {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Student std1  = new Student(100, "Lee");
		Student std2  = new Student(100, "Lee");
		Student std3 = std1;
		
		System.out.println(std1 == std2);  //  다른주소이기에 false
		
		System.out.println(std1.equals(std2)); // equals() override안하면 false  override를 해주면 true
		
		System.out.println(std3.equals(std1)); //  같은 주소이기에 true
		
		System.out.println(std1.hashCode());  
		System.out.println(std2.hashCode());
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		
		
		System.out.println(str1.equals(str2));   // true
		System.out.println(str1.hashCode()); //96354
		System.out.println(str2.hashCode()); //96354
		
		Integer i = 100;
		System.out.println(i.hashCode()); // 100 int는 값이 hash코드이기에 100이 된다.
		
		System.out.println(System.identityHashCode(std1)); // 실제메모리주소 705927765
		System.out.println(System.identityHashCode(std2)); // 실제메모리주소 366712642
		
		
		
		//===========================================================================
		
		
		Student copySyudent = (Student)std1.clone(); // Student에 Cloneable 구현하여   clone()  override 한다.
		System.out.println(copySyudent.toString()); 
	
		
	}

}
