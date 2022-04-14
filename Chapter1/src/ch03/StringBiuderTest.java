package ch03;


/*
 * concat 는 새로운 메모리를 계속 참조하게된다. StringBuilder 나 StringBuffer 는 같은 메모리에 추가하게됨
 * 
 * */
public class StringBiuderTest {

	public static void main(String[] args) {
		
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder builder = new StringBuilder(java);
		
		System.out.println(System.identityHashCode(builder)); // 705927765
		
		builder.append(android);
		
		System.out.println(System.identityHashCode(builder));  // 705927765
		
		
		String test = builder.toString();
		System.out.println(test);
		
	}

}
