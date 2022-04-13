package ch02;

// equals �� hashcode override �ϴ� ����
public class EaulsTest {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Student std1  = new Student(100, "Lee");
		Student std2  = new Student(100, "Lee");
		Student std3 = std1;
		
		System.out.println(std1 == std2);  // false �ٸ� ��ü�̱� ������ 
		
		System.out.println(std1.equals(std2)); // false �ٸ� ��ü�̱� ������   ���� �������̵����� ������ ����ٸ� true
		
		System.out.println(std3.equals(std1)); // true �ּҰ��� ���� ������  
		
		System.out.println(std1.hashCode());  
		System.out.println(std2.hashCode());
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		
		
		System.out.println(str1.equals(str2));   // true
		System.out.println(str1.hashCode()); //96354
		System.out.println(str2.hashCode()); //96354
		
		Integer i = 100;
		System.out.println(i.hashCode()); // 100 intŸ����  ���� hashCode�� ��
		
		System.out.println(System.identityHashCode(std1)); // ����޸𸮰� 705927765
		System.out.println(System.identityHashCode(std2)); // ����޸𸮰� 366712642
		
		
		
		//===========================================================================
		
		
		Student copySyudent = (Student)std1.clone(); // StudentŬ������ Cloneable�� �����ϰ� clone�� override ������Ѵ�.
		System.out.println(copySyudent.toString()); 
	
		
	}

}
